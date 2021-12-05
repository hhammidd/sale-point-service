package com.ireulink.demo.service;

import com.ireulink.demo.dto.SalePointTo;

import java.util.List;

public interface SalePointService {
    List<SalePointTo> getSalesPoints();

    void createSailePoints(SalePointTo salePointTo);
}
