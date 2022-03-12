package com.ireulink.demo.converter;

import com.ireulink.demo.dto.EvInfoTo;
import com.ireulink.demo.model.EvInfo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Component
public class EvInfoMapper {

    public EvInfoTo convertToDto(EvInfo evInfo) {
        return new EvInfoTo(
                evInfo.getId(),
                evInfo.getCountry(),
                evInfo.getEvType(),
                evInfo.getDateInserted().toString(),
                evInfo.getDateInfo().toString(),
                evInfo.getAmount()
        );
    }

    public EvInfo convertToDomain(EvInfoTo evInfoTo) {
        EvInfo evInfo = new EvInfo();

        evInfo.setId(null);
        evInfo.setDateInfo(LocalDate.now()); // TODO change this
        evInfo.setCountry(evInfoTo.getCountry());
        evInfo.setEvType(evInfoTo.getEvType());
        evInfo.setDateInserted(LocalDateTime.now());
        evInfo.setAmount(evInfoTo.getAmount());

        return evInfo;
    }
}
