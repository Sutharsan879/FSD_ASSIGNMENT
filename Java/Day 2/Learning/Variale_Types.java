package com.wipro;
import java.util.*;
public class Variale_Types {
	int b=20;  // Instance or Object Variable
	static int c=30; // Static or Class variable
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=10;  // Local Variables
		System.out.println("Local Variable : "+a);
		
		Variale_Types obj=new Variale_Types();
		System.out.println("Instance Variable : "+obj.b);
		
		System.out.println("Static Variable : "+Variale_Types.c);
	}
}
