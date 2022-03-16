package com.ireulink.demo.controller;

import com.ireulink.demo.dto.EvInfoTo;
import com.ireulink.demo.dto.EvStatisticsTo;
import com.ireulink.demo.service.EvStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ev-statistic")
@CrossOrigin(origins = "*")
public class EvStatisticController {

    @Autowired
    private EvStatisticsService evStatisticsService;

    @GetMapping
    public List<EvStatisticsTo> getEvStatisticsByCountryAndYearMonth(
            @RequestParam(required = false) Integer year,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String evType
    ) {
        return evStatisticsService.getEvStatisticsByCountryAndYearMonth(year, country, evType);
    }

    @PostMapping
    public void createEvStatistics(@RequestBody EvStatisticsTo evStatisticsTo) {
        evStatisticsService.createEvStatistics(evStatisticsTo);
    }
}
