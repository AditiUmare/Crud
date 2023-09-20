package com.codemy.model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "tbl_qualifications")
public class Qualifications {
	
	
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Qua_id")
	 private Long quaId;

	 @Column(name = "Q_name")
	 private String name;

	 @Column(name = "Q_decription")
	 private String description;
	 
	 @ManyToOne
     @JoinColumn(name="emp_id", nullable=false)
	 private EmployeeEntity employee;

	public Long getQuaId() {
		return quaId;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public void setQuaId(Long quaId) {
		this.quaId = quaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	 
//	 @ManyToOne
//	 @JoinColumn(name="emp_id", nullable=false)
//	 private EmployeeEntity employee;



//	 @OneToOne(mappedBy = "qualifications", cascade = CascadeType.ALL)
//	 private StudentQualification studentQualification;



}
