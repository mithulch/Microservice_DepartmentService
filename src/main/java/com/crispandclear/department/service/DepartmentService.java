package com.crispandclear.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crispandclear.department.entity.Department;
import com.crispandclear.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("inside Department service to save the department");
		return departmentRepository.save(department);
	}

	public Department getDepartmentById(Long departmentId) {
		log.info("inside Department service to get the department info by id");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
