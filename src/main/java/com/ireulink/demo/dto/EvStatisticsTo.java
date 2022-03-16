package com.ireulink.demo.dto;

import java.time.YearMonth;

public class EvStatisticsTo {
    private Long id;
    private String country;
    private String evType;
    private Integer year;
    private Integer month;
    private String dateInserted;
    private Integer amount;

    public EvStatisticsTo() {
    }

    public EvStatisticsTo(Long id, String country, String evType, Integer year, Integer month, String dateInserted, Integer amount) {
        this.id = id;
        this.country = country;
        this.evType = evType;
        this.year = year;
        this.month = month;
        this.dateInserted = dateInserted;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEvType() {
        return evType;
    }

    public void setEvType(String evType) {
        this.evType = evType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getDateInserted() {
        return dateInserted;
    }

    public void setDateInserted(String dateInserted) {
        this.dateInserted = dateInserted;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
