package com.codemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemy.model.Qualifications;

@Repository
public interface QualificationRepository extends JpaRepository<Qualifications, Long>{
	

}
