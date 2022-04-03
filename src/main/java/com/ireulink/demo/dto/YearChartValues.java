package com.ireulink.demo.dto;

import java.util.List;

public class YearChartValues {
    private List<ChartValues> chartValues;

    public YearChartValues() {
    }

    public YearChartValues(List<ChartValues> chartValues) {
        this.chartValues = chartValues;
    }

    public List<ChartValues> getChartValues() {
        return chartValues;
    }

    public void setChartValues(List<ChartValues> chartValues) {
        this.chartValues = chartValues;
    }
}
