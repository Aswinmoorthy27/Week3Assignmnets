package Org.department;

import Org.college.College;

public class Department extends College {

	public String deptName(String dep) {
		System.out.println("Department name " + dep);
		return dep;
	}
	
	public static void main(String[] args) {
		
		Department Dx=new Department();
		//able to access only College and Department methods
		System.out.println("Printing college details");
		Dx.collegeName("MIT Anna unviversity");
		Dx.collegeCode(112);
		Dx.collegeRank(2);
		System.out.println("************************");
		System.out.println("Printing Dept details");
		Dx.deptName("Computer Science");
	}
}
