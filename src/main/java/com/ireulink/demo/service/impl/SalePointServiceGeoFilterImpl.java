package com.ireulink.demo.service.impl;

import com.ireulink.demo.client.CombineGeoClient;
import com.ireulink.demo.converter.SalePointMapper;
import com.ireulink.demo.dao.SalePointDao;
import com.ireulink.demo.dto.SalePointGeoFilter;
import com.ireulink.demo.dto.SalePointGeoWithCombineFilter;
import com.ireulink.demo.dto.SalePointTo;
import com.ireulink.demo.dto.SalePointsInfoTo;
import com.ireulink.demo.model.SalePoint;
import com.ireulink.demo.service.SalePointGeoFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalePointServiceGeoFilterImpl implements SalePointGeoFilterService {

    @Autowired
    private SalePointDao salePointDao;

    @Autowired
    private SalePointMapper salePointMapper;

    @Autowired
    private CombineGeoClient combineGeoClient;

    @Override
    public SalePointsInfoTo getSalepointsGeoFilter(SalePointGeoFilter salePointGeoFilter) {
        // TODO You can devided job, you may use OR here to create native query

        // TODO get geo combine ids
//        List<Long> combineGeoIds = combineGeoClient.getGeoCombineIds(geoCombineTo);

        List<SalePoint> salePoints = new ArrayList<>();
        for (Integer salePointGeoIdFilter : salePointGeoFilter.getGeoIds()) {
            salePoints.addAll(salePointDao.findAllByGeoIdAndCountry(salePointGeoIdFilter, salePointGeoFilter.getMarket()));
        }
        List<SalePointTo> salePointTos = new ArrayList<>();

        for (SalePoint salePoint : salePoints) {
            SalePointTo salePointTo = salePointMapper.convertToDto(salePoint);
            salePointTos.add(salePointTo);
        }

        return new SalePointsInfoTo(salePointTos, salePointTos.size());
    }

    @Override
    public SalePointsInfoTo getSalepointsGeoFilterByCombineGeo(SalePointGeoWithCombineFilter salePointGeoWithCombineFilter) {
        // All geo-combine ids / comune/ province
        List<Long> combineGeoIds = combineGeoClient.getGeoCombineIds(salePointGeoWithCombineFilter.getGeoCombineTo());

        List<SalePointTo> salePointTos = new ArrayList<>();

        List<SalePoint> salePoints = new ArrayList<>();
        for (Long salePointGeoIdFilter : combineGeoIds) {
            salePoints.addAll(salePointDao.findAllByGeoIdAndCountry(salePointGeoIdFilter.intValue() , salePointGeoWithCombineFilter.getMarket()));
        }

        // eliminate extra for
        for (SalePoint salePoint : salePoints) {
            SalePointTo salePointTo = salePointMapper.convertToDto(salePoint);
            salePointTos.add(salePointTo);
        }

        return new SalePointsInfoTo(salePointTos, salePointTos.size());
    }
}
