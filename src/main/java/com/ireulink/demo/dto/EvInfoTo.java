package com.ireulink.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EvInfoTo {
    private Long id;
    private String country;
    private String evType;
    private LocalDateTime dateInserted;
    private LocalDate dateInfo;
    private Integer amount;

    public EvInfoTo() {
    }

    public EvInfoTo(Long id, String country, String evType, LocalDateTime dateInserted, LocalDate dateInfo, Integer amount) {
        this.id = id;
        this.country = country;
        this.evType = evType;
        this.dateInserted = dateInserted;
        this.dateInfo = dateInfo;
        this.amount = amount;
    }

    public EvInfoTo(Long id, String country, String evType, LocalDate dateInfo, Integer amount) {
        this.id = id;
        this.country = country;
        this.evType = evType;
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

    public LocalDateTime getDateInserted() {
        return dateInserted;
    }

    public void setDateInserted(LocalDateTime dateInserted) {
        this.dateInserted = dateInserted;
    }

    public LocalDate getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(LocalDate dateInfo) {
        this.dateInfo = dateInfo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
