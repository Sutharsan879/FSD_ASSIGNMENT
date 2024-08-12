package com.wipro;
import java.util.*;
public class This_KeyWord {
	String name;
	This_KeyWord(String name)
	{
		this(30,39);
		this.name=name;
		this.greeting();
	}
	This_KeyWord(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	void greeting()
	{
		System.out.println("Welcome"+" "+name);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		This_KeyWord obj=new This_KeyWord("Pal");
	}

}
