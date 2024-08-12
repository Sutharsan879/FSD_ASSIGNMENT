package com.wipro;
import java.util.*;
public class Method_OverLoading {

	void MyMethod(String name)
	{
		System.out.println("Welcome "+name);
	}
	void MyMethod(int a,int b)
	{
		System.out.println("Sum : "+(a+b));
	}
	void MyMethod(int n)
	{
		System.out.println("Sum : "+(n+n));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Method_OverLoading obj=new Method_OverLoading();
		obj.MyMethod(5);
		obj.MyMethod("PAL");
		obj.MyMethod(10, 20);
	}

}
