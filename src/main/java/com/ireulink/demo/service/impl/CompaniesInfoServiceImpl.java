package com.ireulink.demo.service.impl;

import com.ireulink.demo.client.CombineGeoClient;
import com.ireulink.demo.converter.SalePointMapper;
import com.ireulink.demo.dao.SalePointDao;
import com.ireulink.demo.dto.*;
import com.ireulink.demo.model.SalePoint;
import com.ireulink.demo.service.CompaniesInfoService;
import com.ireulink.demo.service.SalePointGeoFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompaniesInfoServiceImpl implements CompaniesInfoService {

    @Autowired
    private SalePointDao salePointDao;

    @Autowired
    private SalePointMapper salePointMapper;

    @Autowired
    private CombineGeoClient combineGeoClient;

    @Override
    public SalePointsInfoTo getCompaniesInfo() {
        return null;
    }
}
