package com.wipro;
import java.util.*;
class Person
{
	int Age;
	String Name;
	
	Person(int age,String name)
	{
		this.Age=age;
		this.Name=name;
	}
	
	void display()
	{
		System.out.println("Name : "+Name);
		System.out.println("Age  : "+Age);
	}
}
public class Person_Age {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Person obj1=new Person(24,"Dhanush");
		Person obj2=new Person(20,"SUTHARSAN");
		obj1.display();
		obj2.display();
	}

}
