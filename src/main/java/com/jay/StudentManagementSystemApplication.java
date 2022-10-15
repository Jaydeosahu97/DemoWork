package com.jay;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jay.model.Student;
import com.jay.model.SubjectInfo;
import com.jay.repository.StudentRepository;
import com.jay.repository.SubjectInfoRepository;

@SpringBootApplication
public class StudentManagementSystemApplication {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SubjectInfoRepository subRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@PostConstruct
	public void saveDataInDataBase() {
		Student st = new Student();
		st.setId(1);
		st.setName("Ram");
		st.setPercentage(90);
		studentRepository.save(st);
		SubjectInfo subInfo = new SubjectInfo();
		subInfo.setMarks(90);
		subInfo.setSubject("Maths");
		subInfo.setStudent(st);
		subRepository.save(subInfo);
		
	}
}
