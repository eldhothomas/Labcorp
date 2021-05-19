package com.eldho.labcorp.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.eldho.labcorp.domain.EmployeeTo;
import com.eldho.labcorp.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {

	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(path = "/{empId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeTo> getEmployee(@PathVariable("empId") String empId) {
		logger.log(Level.INFO, "Received request to get employee: {}", empId);
		EmployeeTo employeeTo = employeeService.getEmployee(empId);
		return new ResponseEntity<EmployeeTo>(employeeTo, HttpStatus.OK);
	}

	@RequestMapping(path = "/recordWork/{empId}/{workDays}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeTo> recordWork(@PathVariable("empId") String empId,
			@PathVariable("workDays") int workDays) {
		logger.log(Level.INFO, "Received request to record work: {}", workDays);
		EmployeeTo employeeTo = employeeService.recordWork(empId, workDays);
		return new ResponseEntity<EmployeeTo>(employeeTo, HttpStatus.OK);
	}

	@RequestMapping(path = "/takeVacation/{empId}/{vacationDays}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeTo> takeVacation(@PathVariable("empId") String empId,
			@PathVariable("vacationDays") Float vacationDays) {
		logger.log(Level.INFO, "Received request to record vacation: {}", vacationDays);
		EmployeeTo employeeTo = employeeService.takeVacation(empId, vacationDays);
		return new ResponseEntity<EmployeeTo>(employeeTo, HttpStatus.OK);
	}
}
