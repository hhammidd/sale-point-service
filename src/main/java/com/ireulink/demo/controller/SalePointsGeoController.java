package com.ireulink.demo.controller;

import com.ireulink.demo.dto.*;
import com.ireulink.demo.service.SalePointGeoFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/sale-point-geo")
@CrossOrigin(origins = "*")
public class SalePointsGeoController {

    @Autowired
    private SalePointGeoFilterService salePointGeoFilterService;


    @PostMapping
    public SalePointsInfoTo getsalePointByGeoFilter(@RequestBody SalePointGeoFilter salePointGeoFilter) {
        return salePointGeoFilterService.getSalepointsGeoFilter(salePointGeoFilter);
        //TODO check
    }

    @PostMapping("/combine-geo")
    public SalePointsInfoTo getsalePointByGeoFilterAndRegins(@RequestBody SalePointGeoWithCombineFilter salePointGeoWithCombineFilter) {
        return salePointGeoFilterService.getSalepointsGeoFilterByCombineGeo(salePointGeoWithCombineFilter);
        //TODO check
    }

    /**
     * Get the name and Id of province/ regions / comunes
     * filter their Ids
     * @param salePointGeoBeta
     * @return
     */
    @PostMapping("/combine-geo-beta")
    public SalePointsInfoTo getsalePointByGeoFilterAndRegins(@RequestBody SalePointGeoBeta salePointGeoBeta) {

        System.out.println("Start the geo filter NO regions: "
                + salePointGeoBeta.getRegions().size() + " NO provinces and comunes: "
                + salePointGeoBeta.getProvinces() + " and "
                        + salePointGeoBeta.getComunes());

        GeoCombineTo geoCombineTo = new GeoCombineTo();

        geoCombineTo.setRegions(salePointGeoBeta.getRegions().stream()
                .map(RegionDto::getRegionId).collect(Collectors.toList()));

        geoCombineTo.setProvinces(salePointGeoBeta.getProvinces().stream()
                .map(ProvinceDto::getProvinceId).collect(Collectors.toList()));

        geoCombineTo.setComunes(salePointGeoBeta.getComunes().stream()
                .map(ComuneDto::getComuneId).collect(Collectors.toList()));

        SalePointGeoWithCombineFilter salePointGeoWithCombineFilter =
                new SalePointGeoWithCombineFilter(salePointGeoBeta.getId(), geoCombineTo, salePointGeoBeta.getMarket(), salePointGeoBeta.getField());

        return salePointGeoFilterService.getSalepointsGeoFilterByCombineGeo(salePointGeoWithCombineFilter);
        //TODO check
    }

    @PostMapping("/filter-sale-point-test")
    public SalePointsInfoTo getsalePointByGeoFilterAndRsegins(@RequestBody SalePointGeoBeta salePointGeoWithCombineFilter) {
        System.out.printf("test market " + salePointGeoWithCombineFilter.getMarket());

        return new SalePointsInfoTo(Arrays.asList(
                new SalePointTo(1L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(2L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(3L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(4L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(5L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(6L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(7L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(8L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(9L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(10L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(11L, "EV", "sharbatoghli" , 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws")
        ));
        //TODO check
    }
}
