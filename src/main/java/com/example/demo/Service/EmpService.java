package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Domain;
import com.example.demo.Repository.EmpRepo;


@Service
public class EmpService {
	
	@Autowired
	private EmpRepo employee;
	
	public String Create(Domain d) {
		employee.save(d);
		return "success";
	}
	
	public Iterable<Domain> find() {
		Iterable<Domain> list = employee.findAll();
		return list;
	}
	
	public Optional<Domain> findbyid(Integer id){
		Optional<Domain> list = employee.findById(id);
		return list;
	}
	
	public void delete(Integer id) {
		employee.deleteById(id);
	}
	
	public void update(Domain d) {
		Optional <Domain> dom= employee.findById(d.getId());
		Domain domain=new Domain();
		domain=dom.get();
		domain.setEmail(d.getEmail());
		domain.setDomain(d.getDomain());
		domain.setExperience(d.getExperience());
		domain.setName(d.getName());
		employee.save(domain);
	}

}
