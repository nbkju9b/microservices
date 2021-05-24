package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	
	public Department saveDepartment(@RequestBody Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}


	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		
		return departmentRepository.findByDepartmentId(departmentId);
		
	}

}
