package com.example.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Domain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer id;
	public String Name;
	public String Email;
	public Integer Experience;
	public String domain;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getExperience() {
		return Experience;
	}
	public void setExperience(Integer experience) {
		Experience = experience;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	

}
