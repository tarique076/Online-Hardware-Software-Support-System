package com.hardware_software_support.usecases;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Online Hardware Software Support System.");
		System.out.println("=====================================================");
		System.out.println("Enter 1 if you are the HOD.");
		System.out.println("Enter 2 if you are an employee.");
		System.out.println("Enter 3 if you are a system engineer.");
		System.out.println("Enter 4 to exit");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		System.out.println("================================");
		
		switch(choice) {
		
		case 1:
			HodLoginUsecase login = new HodLoginUsecase();
			login.useLoginHod();
			
			while(true) {
				System.out.println("Enter 1 to register a new Engineer.");
				System.out.println("Enter 2 to see the list of all registered engineers.");
				System.out.println("Enter 3 to delete any Engineer.");
				System.out.println("Enter 4 to see all raised complaints");
				System.out.println("Enter 5 to assign a complaint to an engineer.");
				System.out.println("Enter 6 to logout");
				
				int hodChoice=sc.nextInt();
				System.out.println("===================================");
				
				if(hodChoice==1) {
					HodRegisterEngineerUsecase reg = new HodRegisterEngineerUsecase();
					System.out.println("Register a new Engineer.");
					System.out.println("=============================================");
					reg.hodRegisterEngineer();
				}
					
				else if(hodChoice==2) {
					HodCheckEngineers chk = new HodCheckEngineers();
					System.out.println("Engineers List");
					System.out.println("=================================");
					chk.hodCheckEngineers();
				}				
					
				else if(hodChoice==3) {
					HodDeleteEngineer dlt = new HodDeleteEngineer();
					dlt.hodDeleteEngineer();
					System.out.println("====================================");
				}
							
				else if(hodChoice==4) {
					HodCheckComplaints chkCom = new HodCheckComplaints();
					System.out.println("All Complaints");
					System.out.println("=====================================");
					chkCom.hodCheckAllComplaints();
					System.out.println("=====================================");
				}
				
				else if(hodChoice==5) {
					HodAssignComplaintToEngineer assign = new HodAssignComplaintToEngineer();
					assign.assignToEngineer();
					System.out.println("=====================================");
				}
					
				else if(hodChoice==6) {
					Main.main(args);
				}
					
					
				else {
					System.out.println("Invalid choice. Please enter a correct choice.");
					System.out.println("====================================================");
				
				}
			}
		
		}
	}
}
