package com.mangesh.crud;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Book {
	@Id
	int id;
	String name;
	
}
