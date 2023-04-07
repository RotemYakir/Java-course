package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Employee;
import app.core.exceptions.EmployeeSystemException;
import app.core.services.EmployeeService;

@RequestMapping("/employee/controller")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return service.create(employee);
	}

	@GetMapping("/{employeeId}")
	public Employee read(@PathVariable int employeeId) {
		try {
			return service.read(employeeId);
		} catch (EmployeeSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping
	public List<Employee> readAll() {
		return service.readAll();
	}

	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return service.update(employee);
	}

	@PutMapping("/all")
	public void updateAll(@RequestBody List<Employee> emps) {
		for (Employee employee : emps) {
			this.service.update(employee);
		}
	}

	@DeleteMapping
	public void delete(int employeeId) {
		service.delete(employeeId);
	}
}
