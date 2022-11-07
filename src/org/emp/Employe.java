package org.emp;

public class Employe {
	
	private void empId(int Id ) {
		
		
		System.out.println("Employee ID is "+Id);
		
	}
	
	private void empId(String name, long salary ) {
		
		System.out.println("Employee Name is "+name);
		System.out.println("EmployeeMy salary is "+salary);

	}
	
	private void empId(String compname ) {
		
		System.out.println("Company name is "+compname);
	}
	public static void main(String[] args) {
		
		Employe e= new Employe();
		e.empId(2294);
		e.empId("Gokul", 30000);
		e.empId("TechSolution");
	}
		}


//overloading