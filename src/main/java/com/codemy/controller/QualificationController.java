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

import com.codemy.model.Qualifications;
import com.codemy.service.QualificationService;

@RestController
@RequestMapping("/qualification")
public class QualificationController {
	
	@Autowired
	private QualificationService service;
	
	  @GetMapping
	    public List<Qualifications> findAll() {
	        return service.findAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<Qualifications> findById(@PathVariable("id") Long id) {
	        return service.findById(id);
	    }

	    @PostMapping
	    public Qualifications saveQualification(@RequestBody Qualifications qualifications) {
	        return service.saveQualification(qualifications);
	    }

	    @PutMapping
	    public Qualifications update(@RequestBody Qualifications qualifications) {
	        return service.update(qualifications);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable("id") Long id) {
	        service.delete(id);
	    }
}
