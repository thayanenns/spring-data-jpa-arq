package com.praticas.prova.provaJpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity @Data
public class Departments {

	@Id @Column(length = 4)
	private char dept_no;
	
	@Column(length = 40)
	private String dept_name;
	
}
