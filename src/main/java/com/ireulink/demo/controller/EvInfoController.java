package com.ireulink.demo.controller;

import com.ireulink.demo.dto.EvInfoTo;
import com.ireulink.demo.service.EvInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ev-infos")
@CrossOrigin(origins = "*")
public class EvInfoController {

    @Autowired
    private EvInfosService evInfosService;

    @GetMapping
    public List<EvInfoTo> getEvInfos() {
        return evInfosService.getEvInfos();
    }

    @GetMapping("/testv1")
    public List<EvInfoTo> getEvInfosTes() {
        return evInfosService.getEvInfos();
    }

    @PostMapping
    public void createEvInfo(@RequestBody EvInfoTo evInfoTo) {
        evInfosService.createEvInfo(evInfoTo);

    }

}
