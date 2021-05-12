package com.eldho.labcorp.domain;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(String id, String type) {
		super(id, type);
	}

	
	@Override
	public void work(Integer workDays) {
		calculateVacationDays(workDays, 10);
	}

}
