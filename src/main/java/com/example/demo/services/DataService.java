package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.entities.DataDTO;
import com.example.demo.entities.DataEntity;
import com.example.demo.entities.ResponseDataDTO;
import com.example.demo.repositories.DataRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DataService {
	
    private final DataRepository dataRepository;

    public ResponseDataDTO getData() {
    	try {
        List<DataEntity> dataList = dataRepository.findAll();
        log.debug("dataList :{}", dataList);
        log.info("Data fetched from database {}", dataList);
        List<DataDTO> dataDtoList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(dataList)) {
        	dataDtoList = dataList.stream().filter(Objects::nonNull).map(d-> mapDto(d)).collect(Collectors.toList());	
        	}
        return ResponseDataDTO.builder().dataDTO(dataDtoList).build();
    	} catch(Exception e) {
    		log.error("Cannot process the request as :{}", e.getMessage());
    		return null;
    	}
    }
    
    private DataDTO mapDto(DataEntity dataEntity){
    	
    	return DataDTO.builder()
    			.endYear(dataEntity.getEndYear())
    			.intensity(dataEntity.getIntensity())
    			.likelihood(dataEntity.getLikelihood())
    			.relevance(dataEntity.getRelevance())
    			.build();
    }
}
