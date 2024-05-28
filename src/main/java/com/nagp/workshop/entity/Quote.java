package com.nagp.workshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "quotes")
public class Quote {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "quote")
	private String quote;
	@Column(name = "author")
	private String author;
}
