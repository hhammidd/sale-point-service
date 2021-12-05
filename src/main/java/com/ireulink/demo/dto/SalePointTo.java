package com.ireulink.demo.dto;

public class SalePointTo {
    private Long id;
    private String fieldCode;
    private String name;
    private int geoId;
    private String cap;
    private String comune;
    private String province;
    private String country;
    private String tel;
    private String psw;
    private String username;
    private String coords;

    public SalePointTo() {
    }

    public SalePointTo(Long id, String fieldCode, String name, int geoId, String cap, String comune, String province, String country, String tel, String psw, String username, String coords) {
        this.id = id;
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
