package com.ireulink.demo.service;

import com.ireulink.demo.dto.EvInfoTo;
import com.ireulink.demo.dto.SalePointTo;

import java.util.List;

public interface EvInfosService {
    List<EvInfoTo> getEvInfos();
    void createEvInfo(EvInfoTo evInfoTo);
}
