package com.wipro;
import java.util.*;
class Employee 
{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
//	constructor
	Employee (int employeeId,String employeeName,float employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
//	Method
	void display()
	{
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+employeeSalary);
	}
}
public class Object_Class {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee emp1=new Employee(101,"Valan",2000.0f);
		emp1.display();
		Employee emp2=new Employee(102,"kumar",3000.0f);
		emp2.display();
	}
}
