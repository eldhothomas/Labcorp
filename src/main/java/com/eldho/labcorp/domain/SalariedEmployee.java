package com.eldho.labcorp.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SalariedEmployee extends Employee {

	private static final Logger logger = LogManager.getLogger(SalariedEmployee.class);
	public SalariedEmployee(String id) {
		super(id, "S");
	}

	@Override
	public void work(Integer workDays) {
		logger.info("Calculating vacation for Salaried Employee");
		calculateVacationDays(workDays, 15);
	}

}
