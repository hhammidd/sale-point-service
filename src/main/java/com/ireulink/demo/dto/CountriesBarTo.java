package com.ireulink.demo.dto;

import java.util.List;

public class CountriesBarTo {
    private List<BarValuesTo> barValues;

    public CountriesBarTo() {
    }

    public CountriesBarTo(List<BarValuesTo> barValues) {
        this.barValues = barValues;
    }

    public List<BarValuesTo> getBarValues() {
        return barValues;
    }

    public void setBarValues(List<BarValuesTo> barValues) {
        this.barValues = barValues;
    }
}
