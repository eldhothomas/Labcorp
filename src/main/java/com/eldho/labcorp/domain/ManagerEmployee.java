package com.eldho.labcorp.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ManagerEmployee extends Employee {
	private static final Logger logger = LogManager.getLogger(ManagerEmployee.class);
	public ManagerEmployee(String id) {
		super(id, "M");
	}

	@Override
	public void work(Integer workDays) {
		logger.info("Calculating vacation for Manager Employee");
		calculateVacationDays(workDays, 30);
	}

}
