package com.hardware_software_support.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public String registerEngineer(String name, String username, String password, String type, String location) throws EngineerException {
		String res = "";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into engineer (name,username,password,"
					+ "type,location) values(?,?,?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, type);
			ps.setString(5, location);
			
			int x = ps.executeUpdate();
			if(x>0) {
				res = "Engineer registered";
			}else {
				throw new EngineerException("Invalid entries. Please try again.");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EngineerException(e.getMessage());
		}
		
		return res;
	}

	@Override
	public List<Engineer> seeEngineers() throws EngineerException {
		List<Engineer> engs = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from engineer");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Engineer eng = new Engineer();
				
				eng.setEngId(rs.getInt("engId"));
				eng.setName(rs.getString("name"));
				eng.setUserName(rs.getString("username"));
				eng.setPassword(rs.getString("password"));
				eng.setType(rs.getString("type"));
				eng.setLocation(rs.getString("location"));
				
				engs.add(eng);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return engs;
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
