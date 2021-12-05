package com.ireulink.demo.client;

import com.ireulink.demo.dto.GeoCombineTo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(url = "http://localhost:8089", name = "COMBINE-GEO-CLIENT")
public interface CombineGeoClient {

    @PostMapping("/geo-combine")
    List<Long> getGeoCombineIds(GeoCombineTo geoCombineTo);
}
