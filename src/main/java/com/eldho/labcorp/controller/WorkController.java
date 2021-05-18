package com.eldho.labcorp.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.eldho.labcorp.domain.EmployeeTo;
import com.eldho.labcorp.service.WorkService;

@RestController
@RequestMapping("/rest")
public class WorkController {

	private static final Logger logger = LogManager.getLogger(WorkController.class);

	@Autowired
	WorkService vacationService;

	@RequestMapping(path = "/work/{empId}/{workDays}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeTo> work(@PathVariable("empId") String empId,
			@PathVariable("workDays") int workDays) {
		logger.log(Level.INFO, "Received request to record work: {}", workDays);
		EmployeeTo employeeTo = vacationService.work(empId, workDays);
		return new ResponseEntity<EmployeeTo>(employeeTo, HttpStatus.OK);
	}

	@RequestMapping(path = "/takeVacation/{empId}/{vacationDays}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeTo> takeVacation(@PathVariable("empId") String empId,
			@PathVariable("vacationDays") Float vacationDays) {
		logger.log(Level.INFO, "Received request to record vacation: {}", vacationDays);
		EmployeeTo employeeTo = vacationService.takeVacation(empId, vacationDays);
		return new ResponseEntity<EmployeeTo>(employeeTo, HttpStatus.OK);
	}
}
