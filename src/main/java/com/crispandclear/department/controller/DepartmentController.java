package com.crispandclear.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispandclear.department.entity.Department;
import com.crispandclear.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@PostMapping(value = "/add")
	public Department saveDepartment(@RequestBody Department department) {

		log.info("Request recieved to add department {} " + department);
		return service.saveDepartment(department);

	}

	@GetMapping(value = "/getbyid/{id}")
	public Department getDepartment(@PathVariable("id") Long departmentId) {
		log.info("Request recieved to get department information for Id " + departmentId);
		return service.getDepartmentById(departmentId);

	}

}
