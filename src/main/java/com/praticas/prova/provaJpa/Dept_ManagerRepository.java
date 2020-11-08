package com.praticas.prova.provaJpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dept_manager", path = "dept_manager")
public interface Dept_ManagerRepository extends PagingAndSortingRepository<Dept_Manager, Character>{

	List<Dept_Manager> findByFromDate(Date data);

	List<Dept_Manager> findByToDate(Date data);
}
