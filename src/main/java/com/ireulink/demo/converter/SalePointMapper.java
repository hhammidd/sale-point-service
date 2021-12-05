package com.ireulink.demo.converter;

import com.ireulink.demo.dto.SalePointTo;
import com.ireulink.demo.model.SalePoint;
import org.springframework.stereotype.Component;

@Component
public class SalePointMapper {

    public SalePointTo convertToDto(SalePoint salePoint) {
        SalePointTo salePointTo = new SalePointTo();

        salePointTo.setId(salePoint.getId());
        salePointTo.setFieldCode(salePoint.getFieldCode());
        salePointTo.setName(salePoint.getName());
        salePointTo.setGeoId(salePoint.getGeoId());
        salePointTo.setCap(salePoint.getCap());
        salePointTo.setComune(salePoint.getComune());
        salePointTo.setProvince(salePoint.getProvince());
        salePointTo.setCountry(salePoint.getCountry());
        salePointTo.setTel(salePoint.getTel());
        salePointTo.setPsw(salePoint.getPsw());
        salePointTo.setUsername(salePoint.getUsername());
        salePointTo.setCoords(salePoint.getCoords());

        return salePointTo;
    }

    public SalePoint convertToDomain(SalePointTo salePointTo) {
        SalePoint salePoint = new SalePoint();
        salePoint.setId(null);
        salePoint.setFieldCode(salePointTo.getFieldCode());
        salePoint.setName(salePointTo.getName());
        salePoint.setGeoId(salePointTo.getGeoId());
        salePoint.setCap(salePointTo.getCap());
        salePoint.setComune(salePointTo.getComune());
        salePoint.setProvince(salePointTo.getProvince());
        salePoint.setCountry(salePointTo.getCountry());
        salePoint.setTel(salePointTo.getTel());
        salePoint.setPsw(salePointTo.getPsw());
        salePoint.setUsername(salePointTo.getUsername());
        salePoint.setCoords(salePointTo.getCoords());

        return salePoint;
    }
}
