package com.ireulink.demo.dao;


import com.ireulink.demo.model.SalePoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalePointDao extends JpaRepository<SalePoint, Long> {

    List<SalePoint> findAllByGeoIdAndCountry(int k, String market);
}
