package com.example.demo.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "data")
@Entity(name ="data")
public class DataEntity {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "end_year")
    private Integer endYear;
    private Double cityLng;
    private Double cityLat;
    private String insight;
    private String swot;
    private String url;
    private String added;
    private String published;
    private String city;
    private String country;
    private Integer relevance;
    private String pestle;
    private String source;
    private String title;
    private Integer intensity;
    private String topic;
    private String sector;
    private String region;
    private Integer likelihood;

    }

