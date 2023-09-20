package com.codemy.service;

import java.util.List;
import java.util.Optional;

import com.codemy.model.Qualifications;

public interface QualificationService {

	List<Qualifications> findAll();

	Optional<Qualifications> findById(Long id);

	Qualifications update(Qualifications qualifications);

	void delete(Long id);

	Qualifications saveQualification(Qualifications qualifications);

}
