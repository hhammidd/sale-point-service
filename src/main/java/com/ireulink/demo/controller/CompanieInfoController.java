package com.ireulink.demo.controller;

import com.ireulink.demo.dto.*;
import com.ireulink.demo.service.CompaniesInfoService;
import com.ireulink.demo.service.SalePointGeoFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/companies-info")
@CrossOrigin(origins = "*")
public class CompanieInfoController {

    @Autowired
    private CompaniesInfoService companiesInfoService;


    @PostMapping
    public SalePointsInfoTo getsalePointByGeoFilter(@RequestBody SalePointGeoFilter salePointGeoFilter) {
        return companiesInfoService.getCompaniesInfo();
    }

}
