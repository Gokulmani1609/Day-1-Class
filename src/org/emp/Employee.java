package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("Employee Id is 2994");
	}
	
	private void empName() {
       System.out.println("Employee name is Gokul ");
	}
	
	private void empDob() {
       System.out.println("Employee Dob is 16.09.98");
	}
	
	private void empPhone() {
		System.out.println("Employee Phoneno is 9843890779");

	}
	private void empMail() {
       System.out.println("Employee eamilId is gokul@gmail.com");
	}
	
	private void empAddress() {
       System.out.println("Employee address is Chennai");
	}

	public static void main(String[] args) {
		
		Employee c = new Employee();
			c.empId();
			c.empName();
			c.empDob();
			c.empPhone();
			c.empMail();
		    c.empAddress();
	}
}
