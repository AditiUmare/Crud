package com.codemy.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemy.model.StudentQualification;
import com.codemy.repository.StudentQualificationRepo;
import com.codemy.service.StudentQualificationService;

@Service
public class StudentQualificationServiceImpl implements StudentQualificationService{

	@Autowired
	private StudentQualificationRepo studentQualificationRepo;
	
	@Override
	public List<StudentQualification> findAll() {
		 return studentQualificationRepo.findAll();
	}

	@Override
	public Optional<StudentQualification> findById(Long id) {
		return studentQualificationRepo.findById(id);
	}


	@Override
	public StudentQualification update(StudentQualification studentQualification) {
		return studentQualificationRepo.save(studentQualification);
	}

	@Override
	public void delete(Long id) {
		studentQualificationRepo.deleteById(id);
		
	}

	@Override
	public StudentQualification savestudentQualification(StudentQualification studentQualification) {
		return studentQualificationRepo.save(studentQualification);
	}

}
