package com.hardware_software_support.usecases;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Online Hardware Software Support System.");
		System.out.println("=====================================================");
		System.out.println("Enter 1 if you are the HOD.");
		System.out.println("Enter 2 if you are an employee.");
		System.out.println("Enter 3 if you are a system engineer.");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			HodLoginUsecase login = new HodLoginUsecase();
			login.useLoginHod();
		
		}
	}
}
