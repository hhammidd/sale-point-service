package com.ireulink.demo.dto;

import java.util.List;

public class SalePointGeoBeta {
    private Long id;
    private List<RegionDto> regions;
    private List<ProvinceDto> provinces;
    private List<ComuneDto> comunes;
    private String market;
    private String field;

    public SalePointGeoBeta() {
    }

    public SalePointGeoBeta(Long id, List<RegionDto> regions, List<ProvinceDto> provinces, List<ComuneDto> comunes, String market, String field) {
        this.id = id;
        this.regions = regions;
        this.provinces = provinces;
        this.comunes = comunes;
        this.market = market;
        this.field = field;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RegionDto> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionDto> regions) {
        this.regions = regions;
    }

    public List<ProvinceDto> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<ProvinceDto> provinces) {
        this.provinces = provinces;
    }

    public List<ComuneDto> getComunes() {
        return comunes;
    }

    public void setComunes(List<ComuneDto> comunes) {
        this.comunes = comunes;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
