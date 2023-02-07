package com.mangesh.otm.repository;

import org.springframework.data.repository.CrudRepository;

import com.mangesh.otm.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {


}
