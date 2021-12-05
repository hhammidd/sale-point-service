package com.ireulink.demo.dto;

import java.util.List;

public class SalePointGeoFilter {
    private Long id;
    private List<Integer> geoIds;
    private String market;
    private String field;

    public SalePointGeoFilter() {
    }

    public SalePointGeoFilter(Long id, List<Integer> geoIds, String market, String field) {
        this.id = id;
        this.geoIds = geoIds;
        this.market = market;
        this.field = field;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getGeoIds() {
        return geoIds;
    }

    public void setGeoIds(List<Integer> geoIds) {
        this.geoIds = geoIds;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
