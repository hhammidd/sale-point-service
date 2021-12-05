package com.ireulink.demo.service;

import com.ireulink.demo.dto.SalePointGeoFilter;
import com.ireulink.demo.dto.SalePointGeoWithCombineFilter;
import com.ireulink.demo.dto.SalePointTo;
import com.ireulink.demo.dto.SalePointsInfoTo;

import java.util.List;

public interface SalePointGeoFilterService {

    SalePointsInfoTo getSalepointsGeoFilter(SalePointGeoFilter salePointTo);

    SalePointsInfoTo getSalepointsGeoFilterByCombineGeo(SalePointGeoWithCombineFilter salePointGeoWithCombineFilter);
}
