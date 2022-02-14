package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Domain;

@Repository
public interface EmpRepo extends JpaRepository <Domain, Integer> {

}
