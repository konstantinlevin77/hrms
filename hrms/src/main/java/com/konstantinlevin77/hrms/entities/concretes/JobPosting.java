package com.konstantinlevin77.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_postings")
public class JobPosting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="position_id")
	private Position position;
	
	@NotNull
	@NotBlank
	@Column(name="city")
	private String city;
	
	
	@Column(name="min_salary")
	private int minimumSalary;
	
	@Column(name="max_salary")
	private int maximumSalary;
	
	@NotNull
	@NotBlank
	@Column(name="num_open_positions")
	private short numberOfOpenPositions;
	
	@NotNull
	@NotBlank
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@NotNull
	@Column(name="active")
	private boolean active;
	
	@NotNull
	@Column(name="is_remote")
	private boolean remote;
	
	@NotNull
	@Column(name="is_full_time")
	private boolean fullTime;
	
	@NotNull
	@Column(name="is_approved")
	private boolean approved;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	
	

}
