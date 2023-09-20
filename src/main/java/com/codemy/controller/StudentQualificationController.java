package com.codemy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemy.model.StudentQualification;
import com.codemy.service.StudentQualificationService;

@RestController
@RequestMapping("/studentQualification")
public class StudentQualificationController {
	
	@Autowired
	private StudentQualificationService studentQualificationService;
	
	@GetMapping
    public List<StudentQualification> findAll() {
        return studentQualificationService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<StudentQualification> findById(@PathVariable("id") Long id) {
        return studentQualificationService.findById(id);
    }

    @PostMapping
    public StudentQualification savestudentQualification(@RequestBody StudentQualification studentQualification) {
        return studentQualificationService.savestudentQualification(studentQualification);
    }

    @PutMapping
    public StudentQualification update(@RequestBody StudentQualification studentQualification) {
        return studentQualificationService.update(studentQualification);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
    	studentQualificationService.delete(id);
    }

}
