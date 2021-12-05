package com.ireulink.demo.controller;

import com.ireulink.demo.dto.*;
import com.ireulink.demo.service.SalePointGeoFilterService;
import com.ireulink.demo.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sale-point-geo")
@CrossOrigin(origins = "*")
public class SalePointsGeoController {

    @Autowired
    private SalePointGeoFilterService salePointGeoFilterService;


    @PostMapping
    public SalePointsInfoTo getsalePointByGeoFilter(@RequestBody SalePointGeoFilter salePointGeoFilter) {
        return salePointGeoFilterService.getSalepointsGeoFilter(salePointGeoFilter);
        //TODO check
    }

    @PostMapping("/combine-geo")
    public SalePointsInfoTo getsalePointByGeoFilterAndRegins(@RequestBody SalePointGeoWithCombineFilter salePointGeoWithCombineFilter) {
        return salePointGeoFilterService.getSalepointsGeoFilterByCombineGeo(salePointGeoWithCombineFilter);
        //TODO check
    }

//    @PostMapping("/filter-sale-point-test")
//    public String getsalePointByGeoFilterAndRsegins(@RequestBody SalePointGeoWithCombineFilter salePointGeoWithCombineFilter) {
//        System.out.printf("test");
//        return salePointGeoWithCombineFilter.getMarket();
//        //TODO check
//    }
}
