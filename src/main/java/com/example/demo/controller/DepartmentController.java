package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DepartmentController {
   
	
	@Autowired
	DepartmentService deptService;
	
	@PostMapping("/createDepartment")
	public String createDepartment(@RequestBody Department department) {
		boolean b= deptService.isAddNewDepartment(department);
		if (b) {
			return "Department Added";
		}
		else {
			return "Department not added";
		}
	}
}
