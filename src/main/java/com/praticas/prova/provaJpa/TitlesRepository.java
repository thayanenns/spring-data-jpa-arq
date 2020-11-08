package com.praticas.prova.provaJpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "titles", path = "titles")
public interface TitlesRepository extends PagingAndSortingRepository<Titles, Integer> {

	List<Titles> findByTitles(String title);
	
	List<Titles> findByFromDate(Date data);
	
	
}
