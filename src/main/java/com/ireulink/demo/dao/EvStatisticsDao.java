package com.ireulink.demo.dao;


import com.ireulink.demo.model.EvStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvStatisticsDao extends JpaRepository<EvStatistics, Long> {
    List<EvStatistics> findAllByCountryAndYearAndEvType(String country, Integer year, String evType);
}
