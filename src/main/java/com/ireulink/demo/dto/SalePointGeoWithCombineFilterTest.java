package com.ireulink.demo.dto;

import java.util.List;

public class SalePointGeoWithCombineFilterTest {
    private Long id;
    private List<Long> geoCombineTo;
    private String market;
    private String field;

    public SalePointGeoWithCombineFilterTest() {
    }

    public SalePointGeoWithCombineFilterTest(Long id, List<Long> geoCombineTo, String market, String field) {
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

    public List<Long> getGeoCombineTo() {
        return geoCombineTo;
    }

    public void setGeoCombineTo(List<Long> geoCombineTo) {
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
