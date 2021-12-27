package com.ireulink.demo.dto;

import java.util.List;

public class GeosTo {
    private List<String> geos;

    public GeosTo() {
    }

    public GeosTo(List<String> geos) {
        this.geos = geos;
    }

    public List<String> getGeos() {
        return geos;
    }

    public void setGeos(List<String> geos) {
        this.geos = geos;
    }
}
