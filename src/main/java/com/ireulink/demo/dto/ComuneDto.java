package com.ireulink.demo.dto;


public class ComuneDto {
    private Integer comuneId;
    private String comuneName;

    public ComuneDto() {
    }


    public ComuneDto(Integer comuneId, String comuneName) {
        this.comuneId = comuneId;
        this.comuneName = comuneName;
    }

    public Integer getComuneId() {
        return comuneId;
    }

    public void setComuneId(Integer comuneId) {
        this.comuneId = comuneId;
    }

    public String getComuneName() {
        return comuneName;
    }

    public void setComuneName(String comuneName) {
        this.comuneName = comuneName;
    }
}
