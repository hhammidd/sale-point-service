package com.ireulink.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ev_info")
public class EvInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "ev_type")
    private String evType;

    @Column(name = "date_inserted")
    private LocalDateTime dateInserted;

    @Column(name = "date_info")
    private LocalDate dateInfo;

    @Column(name = "amount")
    private Integer amount;

    public EvInfo() {
    }

    public EvInfo(Long id, String country, String evType, LocalDateTime dateInserted, LocalDate dateInfo, Integer amount) {
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
