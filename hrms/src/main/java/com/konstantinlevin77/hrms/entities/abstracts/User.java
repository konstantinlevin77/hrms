package com.konstantinlevin77.hrms.entities.abstracts;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name="email")
	private String email;
	
	@NotNull
	@NotBlank
	@Column(name="password")
	private String password;
	
	

}
