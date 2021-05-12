package com.eldho.labcorp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import com.eldho.labcorp.domain.HourlyEmployee;

@Service
public class VacationService {

	private static final Logger logger = LogManager.getLogger(VacationService.class);

	public void work() {

		logger.info("Creating instance");
		HourlyEmployee hrEmployee01 = new HourlyEmployee("E001", "H");
		logger.info("Instance created");
		logger.info("Employee E001 - Id: " + hrEmployee01.getId() + ". Type: " + hrEmployee01.getType() 		+ ". Total work days: " + hrEmployee01.getTotalWorkDays() + ". Vacation Balance: " 		+ hrEmployee01.getTotalVacationDays());

		hrEmployee01.work(250);
		hrEmployee01.takeVacation((float) 2);

		hrEmployee01.work(200);
		logger.info("Employee E001 - Id: " + hrEmployee01.getId() + ". Type: " + hrEmployee01.getType()
				+ ". Total work days: " + hrEmployee01.getTotalWorkDays() + ". Vacation Balance: "
				+ hrEmployee01.getTotalVacationDays());

	}

}
