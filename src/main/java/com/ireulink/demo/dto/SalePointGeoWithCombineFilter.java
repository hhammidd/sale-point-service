package com.ireulink.demo.dto;


public class SalePointGeoWithCombineFilter {
    private Long id;
    private GeoCombineTo geoCombineTo;
    private String market;
    private String field;

    public SalePointGeoWithCombineFilter() {
    }

    public SalePointGeoWithCombineFilter(Long id, GeoCombineTo geoCombineTo, String market, String field) {
        this.id = id;
        this.geoCombineTo = geoCombineTo;
        this.market = market;
        this.field = field;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeoCombineTo getGeoCombineTo() {
        return geoCombineTo;
    }

    public void setGeoCombineTo(GeoCombineTo geoCombineTo) {
        this.geoCombineTo = geoCombineTo;
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
