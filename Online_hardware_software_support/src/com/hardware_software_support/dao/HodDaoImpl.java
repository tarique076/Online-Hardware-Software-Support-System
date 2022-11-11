package com.hardware_software_support.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.exceptions.HodException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Engineer;
import com.hardware_software_support.model.Hod;
import com.hardware_software_support.util.DBUtil;

public class HodDaoImpl implements HodDao{

	@Override
	public Hod loginHod(String username, String password) throws HodException {
		Hod hod = new Hod();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from hod where username = ? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				hod.setHodId(rs.getInt("hodId"));
				hod.setName(rs.getString("name"));
				hod.setUserName(rs.getString("username"));
				hod.setPassword(rs.getString("password"));
			}else {
				throw new HodException("Invalid Username or Password.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new HodException(e.getMessage());
		}
		
		return hod;
	}

	@Override
	public String registerEngineer() throws EngineerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Engineer> seeEngineers() throws EngineerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEngineer() throws EngineerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaints> checkComplaints() throws ComplaintException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String assignComplaintToEngineer() throws EngineerException {
		// TODO Auto-generated method stub
		return null;
	}

}
