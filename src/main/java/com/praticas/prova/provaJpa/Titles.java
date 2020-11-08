package com.praticas.prova.provaJpa;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data @Entity
public class Titles {

	@Id @Column(length = 10)
	private int emp_no;
	
	@Column(length = 10)
	private String title;

	private Date from_date;
	
	private Date to_date;
}
