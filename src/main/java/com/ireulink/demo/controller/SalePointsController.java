package com.ireulink.demo.controller;

import com.ireulink.demo.dto.SalePointTo;
import com.ireulink.demo.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sale-points")
@CrossOrigin(origins = "*")
public class SalePointsController {

    @Autowired
    private SalePointService salePointService;

    @GetMapping
    public List<SalePointTo> getSailePoints() {
        return salePointService.getSalesPoints();
        //TODO for null and others
    }

    @PostMapping
    public void createSailePoints(@RequestBody SalePointTo salePointTo) {
        salePointService.createSailePoints(salePointTo);
        //TODO checkÏ
    }

}
