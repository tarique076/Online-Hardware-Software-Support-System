package com.hardware_software_support.dao;

import java.util.List;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.exceptions.HodException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Engineer;
import com.hardware_software_support.model.Hod;

public interface HodDao {
	
	public Hod loginHod(String username, String password) throws HodException;
	
	public String registerEngineer() throws EngineerException;
	
	public List<Engineer> seeEngineers() throws EngineerException;
	
	public String deleteEngineer() throws EngineerException;
	
	public List<Complaints> checkComplaints() throws ComplaintException;
	
	public String assignComplaintToEngineer() throws EngineerException;
}
