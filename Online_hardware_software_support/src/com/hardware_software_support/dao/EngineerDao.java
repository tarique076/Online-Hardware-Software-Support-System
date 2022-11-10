package com.hardware_software_support.dao;

import java.util.List;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Engineer;

public interface EngineerDao {
	
	public Engineer loginEngineer() throws EngineerException;
	
	public List<Complaints> checkAssignedComplaints() throws ComplaintException;
	
	public String updateComplaintStatus() throws ComplaintException;
	
	public List<Complaints> checkComplaintsAttended() throws ComplaintException;
	
	public String changeEngineerPassword() throws EngineerException;
}
