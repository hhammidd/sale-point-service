package com.ireulink.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "sale_points")
public class SalePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "field_code")
    private String fieldCode;

    @Column(name = "name")
    private String name;

    @Column(name = "geo_id")
    private int geoId;

    @Column(name = "cap")
    private String cap;

    @Column(name = "comune")
    private String comune;

    @Column(name = "province")
    private String province;

    @Column(name = "country")
    private String country;

    @Column(name = "tel")
    private String tel;

    @Column(name = "psw")
    private String psw;

    @Column(name = "username")
    private String username;

    @Column(name = "coords")
    private String coords;


    public SalePoint() {
    }

    public SalePoint(String fieldCode, String name, int geoId, String cap, String comune, String province, String country, String tel, String psw, String username, String coords) {
        this.fieldCode = fieldCode;
        this.name = name;
        this.geoId = geoId;
        this.cap = cap;
        this.comune = comune;
        this.province = province;
        this.country = country;
        this.tel = tel;
        this.psw = psw;
        this.username = username;
        this.coords = coords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeoId() {
        return geoId;
    }

    public void setGeoId(int geoId) {
        this.geoId = geoId;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }
}
