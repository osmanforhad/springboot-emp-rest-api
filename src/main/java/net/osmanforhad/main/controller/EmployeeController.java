package net.osmanforhad.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.osmanforhad.main.model.Employee;
import net.osmanforhad.main.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	//inject EmployeeRepository Class as dependency
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employee REST API
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
}
