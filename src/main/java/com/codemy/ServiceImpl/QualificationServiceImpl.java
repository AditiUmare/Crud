package com.codemy.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemy.model.EmployeeEntity;
import com.codemy.model.Qualifications;
import com.codemy.repository.QualificationRepository;
import com.codemy.service.QualificationService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;


@Service
public class QualificationServiceImpl implements QualificationService{

	@Autowired
	private QualificationRepository qualificationRepository;
	@Override
	public List<Qualifications> findAll() {
		 return qualificationRepository.findAll();
	}

	@Override
	public Optional<Qualifications> findById(Long id) {
		return qualificationRepository.findById(id);
	}


	@Override
	public Qualifications update(Qualifications qualifications) {
		 return qualificationRepository.save(qualifications);
	}

	@Override
	public void delete(Long id) {
		qualificationRepository.deleteById(id);
		
	}

	@Override
	public Qualifications saveQualification(Qualifications qualifications) {
		
		Qualifications qualification = new Qualifications();
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEid(qualification.getEmployee());
		qualification.setEmployee(employeeEntity);
		
		BeanUtils.copyProperties(qualification, employeeEntity);
		
		return qualificationRepository.save(qualifications);
		
		
		
		
	}

}
