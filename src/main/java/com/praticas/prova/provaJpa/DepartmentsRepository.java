package com.praticas.prova.provaJpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "departments", path = "departments")
public interface DepartmentsRepository extends PagingAndSortingRepository<Departments, Character> {

	List<Departments> findByName(String dept_name);
}
