package com.eldho.labcorp;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.eldho.labcorp.domain.Employee;
import com.eldho.labcorp.domain.HourlyEmployee;
import com.eldho.labcorp.domain.ManagerEmployee;
import com.eldho.labcorp.domain.SalariedEmployee;

@Component
public class ApplicationStartup implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(ApplicationStartup.class);
	public static Map<String, Employee> employeeInstances = new HashMap<String, Employee>();

	@Override
	public void run(ApplicationArguments args) throws Exception {

		logger.info("Application start up tasks");

		//10 Hourly employees
		employeeInstances.put("H001", new HourlyEmployee("H001"));
		employeeInstances.put("H002", new HourlyEmployee("H002"));
		employeeInstances.put("H003", new HourlyEmployee("H003"));
		employeeInstances.put("H004", new HourlyEmployee("H004"));
		employeeInstances.put("H005", new HourlyEmployee("H005"));
		employeeInstances.put("H006", new HourlyEmployee("H006"));
		employeeInstances.put("H007", new HourlyEmployee("H007"));
		employeeInstances.put("H008", new HourlyEmployee("H008"));
		employeeInstances.put("H009", new HourlyEmployee("H009"));
		employeeInstances.put("H010", new HourlyEmployee("H010"));
		logger.info("Created 10 hourly employee instances");

		//10 Salaried employees
		employeeInstances.put("S001", new SalariedEmployee("S001"));
		employeeInstances.put("S002", new SalariedEmployee("S002"));
		employeeInstances.put("S003", new SalariedEmployee("S003"));
		employeeInstances.put("S004", new SalariedEmployee("S004"));
		employeeInstances.put("S005", new SalariedEmployee("S005"));
		employeeInstances.put("S006", new SalariedEmployee("S006"));
		employeeInstances.put("S007", new SalariedEmployee("S007"));
		employeeInstances.put("S008", new SalariedEmployee("S008"));
		employeeInstances.put("S009", new SalariedEmployee("S009"));
		employeeInstances.put("S010", new SalariedEmployee("S010"));
		logger.info("Created 10 salaried employee instances");


		//10 managers
		employeeInstances.put("M001", new ManagerEmployee("M001"));
		employeeInstances.put("M002", new ManagerEmployee("M002"));
		employeeInstances.put("M003", new ManagerEmployee("M003"));
		employeeInstances.put("M004", new ManagerEmployee("M004"));
		employeeInstances.put("M005", new ManagerEmployee("M005"));
		employeeInstances.put("M006", new ManagerEmployee("M006"));
		employeeInstances.put("M007", new ManagerEmployee("M007"));
		employeeInstances.put("M008", new ManagerEmployee("M008"));
		employeeInstances.put("M009", new ManagerEmployee("M009"));
		employeeInstances.put("M010", new ManagerEmployee("M010"));
		logger.info("Created 10 manager employee instances");

	}
}