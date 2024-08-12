package com.wipro;
import java.util.*;
public class Constructor_Overloading {

	Constructor_Overloading(String name)
	{
		System.out.println("Welcome "+name);
	}
	Constructor_Overloading(int a,int b)
	{
		this("Sutharsan");
		System.out.println("Sum : "+(a+b));
	}
	Constructor_Overloading(int n)
	{
		this(10,20);
		System.out.println("Sum : "+(n+n));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Constructor_Overloading obj3=new Constructor_Overloading(5);	
	}
}
