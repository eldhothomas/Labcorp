package com.eldho.labcorp.domain;

public class EmployeeTo {

	private String empId;
	private Integer workDays;
	private Float vacationDays;

	public EmployeeTo(String empId, Integer workDays, Float vacationDays) {
		this.empId = empId;
		this.workDays = workDays;
		this.vacationDays = vacationDays;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Integer getWorkDays() {
		return workDays;
	}
	public void setWorkDays(Integer workDays) {
		this.workDays = workDays;
	}
	public Float getVacationDays() {
		return vacationDays;
	}
	public void setVacationDays(Float vacationDays) {
		this.vacationDays = vacationDays;
	}

}
