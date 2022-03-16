package com.ireulink.demo.service;

import com.ireulink.demo.dto.EvStatisticsTo;

import java.util.List;

public interface EvStatisticsService {
    List<EvStatisticsTo> getEvStatisticsByCountryAndYearMonth(Integer yearMonth, String country, String evType);
    void createEvStatistics(EvStatisticsTo evStatisticsTo);
}
