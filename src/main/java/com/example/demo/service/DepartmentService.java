package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("deptService")
public class DepartmentService {
	@Autowired
	private DepartmentRepository deptRepo;
	
	public boolean isAddNewDepartment (Department department) {
		return  deptRepo.isAddNewDepartment(department);
	}
}
