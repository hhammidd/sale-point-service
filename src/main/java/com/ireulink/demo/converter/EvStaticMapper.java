package com.ireulink.demo.converter;

import com.ireulink.demo.dto.EvStatisticsTo;
import com.ireulink.demo.model.EvStatistics;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class EvStaticMapper {

    public EvStatisticsTo convertToDto(EvStatistics evStatistics) {
        return new EvStatisticsTo(
                evStatistics.getId(),
                evStatistics.getCountry(),
                evStatistics.getEvType(),
                evStatistics.getYear(),
                evStatistics.getMonth(),
                evStatistics.getDateInserted().toString(),
                evStatistics.getAmount()
        );
    }

    public EvStatistics convertToDomain(EvStatisticsTo evStatisticsTo) {
        EvStatistics evStatistics = new EvStatistics();

        evStatistics.setId(null);
        evStatistics.setCountry(evStatisticsTo.getCountry());
        evStatistics.setEvType(evStatisticsTo.getEvType());
        evStatistics.setEvType(evStatisticsTo.getEvType());
        evStatistics.setYear(evStatisticsTo.getYear());
        evStatistics.setMonth(evStatisticsTo.getMonth());
        evStatistics.setDateInserted(LocalDateTime.now());
        evStatistics.setAmount(evStatisticsTo.getAmount());

        return evStatistics;
    }
}
