package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;




@Data
@AllArgsConstructor
@Entity
@Table(name="positions")
public class Position {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Position() {
		
	}
	
	

}
