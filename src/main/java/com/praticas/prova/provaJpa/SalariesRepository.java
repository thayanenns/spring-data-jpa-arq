package com.praticas.prova.provaJpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "salaries", path = "salaries")

public interface SalariesRepository extends PagingAndSortingRepository<Salaries, Integer> {

	List<Salaries> findBySalaries(int salaries);
	
	List<Salaries> findByFromDate(Date data);



}
