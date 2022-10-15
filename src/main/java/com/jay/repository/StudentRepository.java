package com.jay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jay.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
