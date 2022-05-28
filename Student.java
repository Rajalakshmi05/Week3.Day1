package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student Name:Rajalakshmi Mahalingam");
	}
	public void studentDept()
	{
		System.out.println("Student Department: Computer Science And Engineering");
	}
	public void studentId()
	{
		System.out.println("Student Id: D12CS003");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentId();
		s.studentName();
		s.studentDept();
	}

}
