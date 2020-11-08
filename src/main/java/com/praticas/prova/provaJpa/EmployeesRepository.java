package com.praticas.prova.provaJpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Employees", path = "Employees")
public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Integer> {

	List<Employees> findByGender(String gender);

	List<Employees> findByFirstName(String firstName);

}
