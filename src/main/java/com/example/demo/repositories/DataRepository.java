package com.example.demo.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.DataEntity;
import com.example.demo.services.DataFilter;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
    
	@Query("select d from data d where "
			+ " (:#{#filter.endYear} is null or d.endYear = :#{#filter.endYear}) "
			+ "and (:#{#filter.source} is null or d.source = :#{#filter.source}) "
			+ "and (:#{#filter.swot} is null or d.swot = :#{#filter.swot}) "
			+ "and (:#{#filter.topic} is null or d.topic = :#{#filter.topic}) "
			+ "and (:#{#filter.pestle} is null or d.pestle = :#{#filter.pestle}) "
			+ "and (:#{#filter.city} is null or d.city = :#{#filter.city}) "
			+ "and (:#{#filter.country} is null or d.country = :#{#filter.country}) "
			+ "and (:#{#filter.region} is null or d.region = :#{#filter.region}) "
			+ "and (:#{#filter.sector} is null or d.sector = :#{#filter.sector}) "
			+ "and (:#{#filter.title} is null or d.title = :#{#filter.title}) "
			+ "order by d.id")		
			List<DataEntity> findByFilter(@Param("filter") DataFilter filter);
        
}
