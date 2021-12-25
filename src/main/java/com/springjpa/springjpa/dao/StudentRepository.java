package com.springjpa.springjpa.dao;

import com.springjpa.springjpa.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
