package com.praticas.prova.provaJpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Dept_Manager {
	
	@Id @Column(length = 4)
	private char dept_no;

	@Column(length = 10)
	private int emp_no;
	
	private Date from_date;
	
	private Date to_date;
}
