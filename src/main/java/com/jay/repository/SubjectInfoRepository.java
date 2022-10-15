package com.jay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jay.model.Student;
import com.jay.model.SubjectInfo;
@Repository
public interface SubjectInfoRepository extends JpaRepository<SubjectInfo, Integer> {
	List<Student> findByStudentId(int id);
}
