package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataDTO {

    @JsonProperty("intensity")
    private Integer intensity;

    @JsonProperty("likelihood")
    private Integer likelihood;

    @JsonProperty("relevance")
    private Integer relevance;
    
    @JsonProperty("labels")
    private Integer endYear;
  
}
