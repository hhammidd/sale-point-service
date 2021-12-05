package com.ireulink.demo.service.impl;

import com.ireulink.demo.converter.SalePointMapper;
import com.ireulink.demo.dao.SalePointDao;
import com.ireulink.demo.dto.SalePointTo;
import com.ireulink.demo.model.SalePoint;
import com.ireulink.demo.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalePointServiceImpl implements SalePointService {

    @Autowired
    private SalePointDao utenteDao;

    @Autowired
    private SalePointMapper salePointMapper;

    @Override
    public List<SalePointTo> getSalesPoints() {
        List<SalePoint> salePoints = utenteDao.findAll();
        List<SalePointTo> salePointTos = new ArrayList<>();

        for (SalePoint salePoint : salePoints) {
            SalePointTo salePointTo = salePointMapper.convertToDto(salePoint);
            salePointTos.add(salePointTo);
        }
        return salePointTos;
    }

    @Override
    public void createSailePoints(SalePointTo salePointTo) {
        SalePoint salePoint = salePointMapper.convertToDomain(salePointTo);
        utenteDao.save(salePoint);
        //TODO Add check
    }
}
