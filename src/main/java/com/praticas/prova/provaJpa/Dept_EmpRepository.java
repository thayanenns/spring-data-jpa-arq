package com.praticas.prova.provaJpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dept_emp", path = "dept_emp")
public interface Dept_EmpRepository extends PagingAndSortingRepository<Dept_Emp, Integer>{

	List<Dept_Emp> findByFromDate(Date data);

	List<Dept_Emp> findByToDate(Date data);
}
