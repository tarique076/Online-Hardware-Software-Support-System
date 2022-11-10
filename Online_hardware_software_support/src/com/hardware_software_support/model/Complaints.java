package com.hardware_software_support.model;

public class Complaints {

	private int complaintId;
	private int empId;
	private String complaintType;
	private int engId;
	private String status;
	private String dateRaised;
	private String dateResolved;
	
	public Complaints() {}

	public Complaints(int complaintId, int empId, String complaintType, int engId, String status, String dateRaised,
			String dateResolved) {
		super();
		this.complaintId = complaintId;
		this.empId = empId;
		this.complaintType = complaintType;
		this.engId = engId;
		this.status = status;
		this.dateRaised = dateRaised;
		this.dateResolved = dateResolved;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public int getEngId() {
		return engId;
	}

	public void setEngId(int engId) {
		this.engId = engId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateRaised() {
		return dateRaised;
	}

	public void setDateRaised(String dateRaised) {
		this.dateRaised = dateRaised;
	}

	public String getDateResolved() {
		return dateResolved;
	}

	public void setDateResolved(String dateResolved) {
		this.dateResolved = dateResolved;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", empId=" + empId + ", complaintType=" + complaintType
				+ ", engId=" + engId + ", status=" + status + ", dateRaised=" + dateRaised + ", dateResolved="
				+ dateResolved + "]";
	}
	
	
}
