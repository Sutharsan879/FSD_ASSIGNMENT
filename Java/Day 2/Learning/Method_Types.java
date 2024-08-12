package com.wipro;
import java.util.*;
public class Method_Types {

	void myMethod()
	{
		System.out.println("Instance Method");
	}
	static void myMethod2()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Method_Types obj=new Method_Types();
		obj.myMethod();
		
		Method_Types.myMethod2();
	}
}
