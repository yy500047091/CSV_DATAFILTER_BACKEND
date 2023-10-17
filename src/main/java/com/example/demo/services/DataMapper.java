package com.example.demo.services;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.example.demo.entities.DataDTO;
import com.example.demo.entities.DataEntity;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface DataMapper {
	
			
	

}
