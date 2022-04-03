package com.ireulink.demo.dto;

import java.util.List;

public class ChartValues {
    private String name;
    private Double y;

    public ChartValues() {
    }

    public ChartValues(String name, Double y) {
        this.name = name;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
