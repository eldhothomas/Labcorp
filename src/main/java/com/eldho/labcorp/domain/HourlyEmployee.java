package com.eldho.labcorp.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HourlyEmployee extends Employee {

	private static final Logger logger = LogManager.getLogger(HourlyEmployee.class);

	public HourlyEmployee(String id) {
		super(id, "H");
	}

	@Override
	public void work(Integer workDays) {
		logger.info("Calculating vacation for Hourly Employee");
		calculateVacationDays(workDays, 10);
	}

}
