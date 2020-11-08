package com.praticas.prova.provaJpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data 
public class Employees {

	@Id @Column(length = 10)
	private int emp_no;
	
	private Date birth_date;
	
	private String first_name;
	
	private String last_name;

	private Enum<Gender> gender;
	
	private Date hire_date;
}
