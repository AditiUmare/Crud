package com.codemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemy.model.StudentQualification;

@Repository
public interface StudentQualificationRepo extends JpaRepository<StudentQualification , Long>{

}
