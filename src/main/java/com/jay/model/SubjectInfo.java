package com.jay.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class SubjectInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	private Long id;

	private String subject;
	private int marks;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "student_id",nullable = false)
	private Student student;
}
