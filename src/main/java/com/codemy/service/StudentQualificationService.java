package com.codemy.service;

import java.util.List;
import java.util.Optional;

import com.codemy.model.StudentQualification;

public interface StudentQualificationService {

	List<StudentQualification> findAll();

	Optional<StudentQualification> findById(Long id);


	StudentQualification update(StudentQualification studentQualification);

	void delete(Long id);

	StudentQualification savestudentQualification(StudentQualification studentQualification);

}
