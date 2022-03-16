package com.ireulink.demo.service.impl;

import com.ireulink.demo.converter.EvStaticMapper;
import com.ireulink.demo.dao.EvStatisticsDao;
import com.ireulink.demo.dto.EvInfoTo;
import com.ireulink.demo.dto.EvStatisticsTo;
import com.ireulink.demo.model.EvInfo;
import com.ireulink.demo.model.EvStatistics;
import com.ireulink.demo.service.EvStatisticsService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

@Service
public class EvStatisticServiceImpl implements EvStatisticsService {

    @Autowired
    private EvStatisticsDao evStatisticsDao;

    @Autowired
    private EvStaticMapper evStaticMapper;

    @Override
    public List<EvStatisticsTo> getEvStatisticsByCountryAndYearMonth(Integer year, String country, String evType) {
        List<EvStatistics> evStatistics = evStatisticsDao.findAllByCountryAndYearAndEvType(country, year, evType);
        List<EvStatisticsTo> evStatisticsTos = new ArrayList<>();
        for (EvStatistics evStatistic : evStatistics) {
            EvStatisticsTo evStatisticsTo = evStaticMapper.convertToDto(evStatistic);
            evStatisticsTos.add(evStatisticsTo);
        }
        return evStatisticsTos;
    }

    @Override
    public void createEvStatistics(EvStatisticsTo evStatisticsTo) {
        EvStatistics evStatistics = evStaticMapper.convertToDomain(evStatisticsTo);
        evStatisticsDao.save(evStatistics);
    }
}
