package com.hardware_software_support.dao;

import java.util.List;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EmployeeException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Employee;

public interface EmployeeDao {

	public String registerEmployee() throws EmployeeException;
	
	public Employee loginEmployee() throws EmployeeException;
	
	public int raiseComplaint() throws ComplaintException;
	
	public String checkComplaintStatus() throws ComplaintException;
	
	public List<Complaints> checkComplaintHistory() throws ComplaintException;
	
	public String changeEmployeePassword() throws EmployeeException;
	
}
