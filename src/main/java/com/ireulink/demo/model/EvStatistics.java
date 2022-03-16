package com.ireulink.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ev_statistic")
public class EvStatistics {

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

    @Column(name = "year")
    private int year;

    @Column(name = "month")
    private int month;

    @Column(name = "amount")
    private Integer amount;

    public EvStatistics() {
    }

    public EvStatistics(Long id, String country, String evType, LocalDateTime dateInserted, int year, int month, Integer amount) {
        this.id = id;
        this.country = country;
        this.evType = evType;
        this.dateInserted = dateInserted;
        this.year = year;
        this.month = month;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
