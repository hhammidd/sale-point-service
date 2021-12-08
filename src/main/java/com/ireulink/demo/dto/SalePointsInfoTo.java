package com.ireulink.demo.dto;

import java.util.List;

public class SalePointsInfoTo {
    private List<SalePointTo> salePointTos;

    public SalePointsInfoTo() {
    }

    public SalePointsInfoTo(List<SalePointTo> salePointTos) {
        this.salePointTos = salePointTos;
    }

    public List<SalePointTo> getSalePointTos() {
        return salePointTos;
    }

    public void setSalePointTos(List<SalePointTo> salePointTos) {
        this.salePointTos = salePointTos;
    }
}
