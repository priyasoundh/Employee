package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.Domain;
import com.example.demo.Service.EmpService;

@RestController
public class Controller {
	
	@Autowired
	private EmpService e;
	
	@PostMapping("/create")
	public String create(@RequestBody Domain d) {
		String response = e.Create(d);
		return response;
	}
	
	@GetMapping("/view")
	public Iterable<Domain> find() {
		Iterable<Domain> b = e.find();
		return b;
	}
	
	@GetMapping("/viewall")
	public Optional<Domain> findbyid(@RequestParam Integer id) {
		Optional<Domain> b = e.findbyid(id);
		return b;
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam Integer id) {
		e.delete(id);
		return "deleted";
	}
	
	@PutMapping("/update")
	public String Update(@RequestBody Domain d) {
		e.update(d);
		return "updated";
	}

}
