package org.two.test.role;


import org.ins.test.company.employee;
import org.ins.test.company.profile;


public class role {
	private void quality() {
		// TODO Auto-generated method stub
System.out.println("qulity controller");
	}
	private void responsiple() {
		// TODO Auto-generated method stub
System.out.println("material testing");
	}
	public static void main(String[] args) {
		role c=new role();
		c.quality();
		c.responsiple();
		
		employee a=new employee();
		profile b=new profile();
	
		a.employeeId();
		a.employeename();
		b.dateofbirth();
		b.fathername();
		b.mothername();
		
	}

}
