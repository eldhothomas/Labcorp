package com.eldho.labcorp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.eldho.labcorp.ApplicationStartup;
import com.eldho.labcorp.domain.Employee;

@Service
public class VacationService {

	private static final Logger logger = LogManager.getLogger(VacationService.class);

	public void work(String empId, int workDays) {

		Object object = ApplicationStartup.employeeInstances.get(empId);
		if (object == null) {
			logger.info("Employee " + empId + " not found");
			return;
		}

		Employee employee = (Employee) object;

		logger.info("Before. Emp Id: " + employee.getId() + ". Type: " + employee.getType() + ". Total work days: "
				+ employee.getTotalWorkDays() + ". Vacation Balance: " + employee.getTotalVacationDays());
		employee.work(workDays);
		logger.info(
				"After. Employee - Id: " + employee.getId() + ". Type: " + employee.getType() + ". Total work days: "
						+ employee.getTotalWorkDays() + ". Vacation Balance: " + employee.getTotalVacationDays());

	}

	public void takeVacation(String empId, Float vacationDays) {

		Object object = ApplicationStartup.employeeInstances.get(empId);
		if (object == null) {
			logger.info("Employee " + empId + " not found");
			return;
		}

		Employee employee = (Employee) object;

		logger.info("Before. Emp Id: " + employee.getId() + ". Type: " + employee.getType() + ". Total work days: "
				+ employee.getTotalWorkDays() + ". Vacation Balance: " + employee.getTotalVacationDays());
		employee.takeVacation(vacationDays);
		logger.info(
				"After. Employee - Id: " + employee.getId() + ". Type: " + employee.getType() + ". Total work days: "
						+ employee.getTotalWorkDays() + ". Vacation Balance: " + employee.getTotalVacationDays());

	}

}
