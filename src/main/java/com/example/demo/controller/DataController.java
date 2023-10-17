package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ResponseDataDTO;
import com.example.demo.services.DataFilter;
import com.example.demo.services.DataService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/v1/api/")
@RequiredArgsConstructor
public class DataController {
	
    private final  DataService dataService;


    @GetMapping("/data/filter")
    public ResponseEntity<ResponseDataDTO> getData(
            @RequestParam(name = "endYear", required = false) Integer endYear,
            @RequestParam(name = "swot", required = false) String swot,
            @RequestParam(name = "city", required = false) String city,
            @RequestParam(name = "country", required = false) String country,
            @RequestParam(name = "pestle", required = false) String pestle,
            @RequestParam(name = "source", required = false) String source,
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "topic", required = false) String topic,
            @RequestParam(name = "sector", required = false) String sector,
            @RequestParam(name = "region", required = false) String region
    ) {
        DataFilter  filter = DataFilter.builder().city(city).country(country).endYear(endYear)
        		.region(region)
        		.pestle(pestle)
        		.source(source)
        		.topic(topic)
        		.swot(swot)
        		.sector(sector)
        		.title(title).build();
        log.info("Filter Parameters for the api : {}", filter);
        return ResponseEntity.ok(dataService.getData());
        
    }
}
