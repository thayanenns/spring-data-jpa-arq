package com.praticas.prova.provaJpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Dept_Emp {
	
	@Id @Column(length = 10)
	private int emp_no;
	
	@Column(length = 4)
	private char dept_no;
	
	private Date from_date;
	
	private Date to_date;

}
