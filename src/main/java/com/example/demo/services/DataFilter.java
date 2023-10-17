package com.example.demo.services;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder(toBuilder = true)
public class DataFilter {
    
    private Integer endYear;
    private String title;
    private String swot;
    private String city;
    private String country;
    private String pestle;
    private String source;
    private String topic;
    private String sector;
    private String region;
    
}
