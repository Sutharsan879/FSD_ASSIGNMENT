package com.wipro;
import java.util.*;
class employee
{
	String Name;
	String Job_Title;
	Double Salary;
	
	employee(String name,String job_title,double salary)
	{
		this.Name=name;
		this.Job_Title=job_title;
		this.Salary=salary;
	}
	
	void calculate()
	{
		System.out.println("Name : "+Name);
		System.out.println("Job Title : "+Job_Title);
		System.out.println("Salary : "+Salary);
	}
	
	public void updatesalary(double Percentage) 
	{
		if(Percentage>0) 
		{
			double updatenew=Salary*(Percentage/100);
			Salary +=updatenew;
			System.out.println("Salary Increased by "+ Percentage+"%");
		}
		else 
		{
			System.out.println("Salary Percentage Should be Positive");
		}
	}
}
public class Employee_Name_Job_Salary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		employee a=new employee("Sutharsan","Web Developer",25000.00);
		a.calculate();
		System.out.println();
		System.out.println("Updated details : ");
		System.out.println();
		a.updatesalary(40000.0);
		a.calculate();
	}

}
