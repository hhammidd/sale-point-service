package com.ireulink.demo.dto;

import java.math.BigDecimal;
import java.util.List;

public class BarValuesTo {
    private String name;
    private List<Double> data;

    public BarValuesTo() {
    }

    public BarValuesTo(String name, List<Double> data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }
}
