package com.codemy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_studentQualification")
public class StudentQualification {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SQ_id")
	private Long id;

	@Column(name = "SQ_Year")
	private int year;

	@Column(name = "SQ_Percentage")
	private double percentage;
	
	@Column(name = "SQ_University ")
	private String university;

	@Column(name = "SQ_College")
	private String college;
	
//	@OneToOne
//	@JoinColumn(name = "stu_id")
//	private Qualifications qualifications;
//
//
//	@OneToOne(mappedBy = "studentQualification")
//	private Qualifications qualifications;
}
