package Org.student;

import Org.department.Department;

public class Student extends Department {
	
	public String studentName(String name) {

		System.out.println("Student name is " + name);
		return name;
	}

	public String studentDept(String dept) {
		System.out.println("Student dept "+dept );
		return dept;
	}

	public int studentId(int ID) {
		System.out.println("Student  Id is " + ID);
		return ID;
	}

	
	public static void main(String[] args) {
		
		Student sx=new Student();
		//able to access all College,Department,Student methods (multilevel inheritance)
		System.out.println("Printing college details");
		sx.collegeName("MIT Anna unviversity");
		sx.collegeCode(112);
		sx.collegeRank(2);
		System.out.println("************************");
		System.out.println("Printing Dept details");
		sx.deptName("Computer Science");
		System.out.println("************************");
		System.out.println("Printing Student details");
		sx.studentName("Aswin");
		sx.studentDept("Computer science");
		sx.studentId(16104);
		
		
	}
}
