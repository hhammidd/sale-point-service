package com.ireulink.demo.controller;

import com.ireulink.demo.dto.*;
import com.ireulink.demo.service.SalePointGeoFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
     *
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
                new SalePointTo(1L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(2L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(3L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(4L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(5L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(6L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(7L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(8L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(9L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(10L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(11L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws")
        ));
        //TODO check
    }

    @PostMapping("/filter-with-map")
    public SalePointsInfoTo getsalePointsWithFeatures(@RequestBody GeosTo geosTo) {
//        System.out.printf("test geos " + geosTo);
        // Create regions/province/ .... and return sales
        geosTo.getGeos().stream().forEach(s -> System.out.println(s));
        System.out.println("============finished===========");
        return new SalePointsInfoTo(Arrays.asList(
                new SalePointTo(1L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(2L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(3L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(4L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(5L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(6L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(7L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(8L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(9L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(10L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws"),
                new SalePointTo(11L, "EV", "sharbatoghli", 11, "1111cap", "Milan", "Milan", "Italy", "tel", "sswwsw", "swsws", "swssws")
        ));
        //TODO check
    }

    @GetMapping("/countries-map/{year}")
    public YearChartValues getYearChartValue(@PathVariable Integer year) { // TODO make with year
        // Make service for it
        System.out.println("============Start===========");

        List<ChartValues> chartValues = new ArrayList<>();
        ChartValues jan = new ChartValues("JAN", new Double(100));
        ChartValues feb = new ChartValues("FEB", new Double(105));
        ChartValues mar = new ChartValues("MAR", new Double(170));
        ChartValues apr = new ChartValues("APR", new Double(90));
        ChartValues may = new ChartValues("MAY", new Double(70));
        ChartValues jun = new ChartValues("JUN", new Double(120));
        ChartValues jul = new ChartValues("JUL", new Double(100));
        ChartValues aug = new ChartValues("AUG", new Double(111));
        ChartValues sep = new ChartValues("SEP", new Double(50));
        ChartValues oct = new ChartValues("OCT", new Double(70));
        ChartValues nov = new ChartValues("NOV", new Double(40));
        ChartValues dec = new ChartValues("DEC", new Double(50));
        chartValues.add(jan);
        chartValues.add(feb);
        chartValues.add(mar);
        chartValues.add(apr);
        chartValues.add(may);
        chartValues.add(jun);
        chartValues.add(jul);
        chartValues.add(aug);
        chartValues.add(sep);
        chartValues.add(oct);
        chartValues.add(nov);
        chartValues.add(dec);

        return new YearChartValues(chartValues);
    }

    @GetMapping("/countries-map")
    public CountriesBarTo getCountriesMock() { // TODO make with year

        // Make service for it
        System.out.println("============finished===========");


        List<BarValuesTo> barValues = new ArrayList<>();
        BarValuesTo barValuesToNL = createBarChart("NL");
        BarValuesTo barValuesToIT = createBarChart("IT");
        BarValuesTo barValuesToBE = createBarChart("BE");
        barValues.add(barValuesToNL);
        barValues.add(barValuesToIT);
        barValues.add(barValuesToBE);
        return new CountriesBarTo(barValues);
    }

    private BarValuesTo createBarChart(String country) {
        List<Double> data = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            data.add(createBigDecimalDataFor12Weeks());
        }
        return new BarValuesTo(country, data);
    }

    private Double createBigDecimalDataFor12Weeks() {
        BigDecimal max = new BigDecimal(10);
        BigDecimal randFromDouble = new BigDecimal(Math.random());
        BigDecimal actualRandomDec = randFromDouble.multiply(max);
        return actualRandomDec
                .setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
    }
}
