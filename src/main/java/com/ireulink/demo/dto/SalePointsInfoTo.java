package com.ireulink.demo.dto;

import java.util.List;

public class SalePointsInfoTo {
    private List<SalePointTo> salePointTos;
    private Integer count;

    public SalePointsInfoTo() {
    }

    public SalePointsInfoTo(List<SalePointTo> salePointTos, Integer count) {
        this.salePointTos = salePointTos;
        this.count = count;
    }

    public List<SalePointTo> getSalePointTos() {
        return salePointTos;
    }

    public void setSalePointTos(List<SalePointTo> salePointTos) {
        this.salePointTos = salePointTos;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
