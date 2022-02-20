package com.ireulink.demo.service.impl;

import com.ireulink.demo.converter.EvInfoMapper;
import com.ireulink.demo.dao.EvInfoDao;
import com.ireulink.demo.dto.EvInfoTo;
import com.ireulink.demo.model.EvInfo;
import com.ireulink.demo.service.EvInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvInfosServiceImpl implements EvInfosService {

    @Autowired
    private EvInfoDao evInfoDao;

    @Autowired
    private EvInfoMapper evInfoMapper;

    @Override
    public List<EvInfoTo> getEvInfos() {
        List<EvInfo> infoDaoAll = evInfoDao.findAll();
        List<EvInfoTo> evInfoToTos = new ArrayList<>();

        for (EvInfo evInfo : infoDaoAll) {
            EvInfoTo evInfoTo = evInfoMapper.convertToDto(evInfo);
            evInfoToTos.add(evInfoTo);
        }
        return evInfoToTos;
    }

    @Override
    public void createEvInfo(EvInfoTo evInfoTo) {
        EvInfo salePoint = evInfoMapper.convertToDomain(evInfoTo);
        evInfoDao.save(salePoint);
    }
}
