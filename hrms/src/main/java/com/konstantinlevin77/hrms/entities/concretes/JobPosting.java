package com.konstantinlevin77.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

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
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="position_id")
	private Position position;
	
	@Column(name="city")
	private String city;
	
	@Column(name="min_salary")
	private int minimumSalary;
	
	@Column(name="max_salary")
	private int maximumSalary;
	
	@Column(name="num_open_positions")
	private short numberOfOpenPositions;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="active")
	private boolean active;
	
	

}
