package com.ireulink.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EvInfoTo {
    private Long id;
    private String country;
    private String evType;
    private String dateInserted;
    private String dateInfo;
    private Integer amount;

    public EvInfoTo() {
    }

    public EvInfoTo(Long id, String country, String evType, String dateInserted, String dateInfo, Integer amount) {
        this.id = id;
        this.country = country;
        this.evType = evType;
        this.dateInserted = dateInserted;
        this.dateInfo = dateInfo;
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

    public String getDateInserted() {
        return dateInserted;
    }

    public void setDateInserted(String dateInserted) {
        this.dateInserted = dateInserted;
    }

    public String getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(String dateInfo) {
        this.dateInfo = dateInfo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
