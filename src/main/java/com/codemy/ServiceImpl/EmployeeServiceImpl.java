package com.codemy.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemy.model.EmployeeEntity;
import com.codemy.repository.EmployeeRepository;
import com.codemy.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		 return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		 return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
		
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		 return employeeRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		 employeeRepository.deleteById(id);
		
	}

}
