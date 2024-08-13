package com.wipro;
import java.util.*;
class Circle
{
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	void setradius(double radius)
	{
		this.radius=radius;
	}
	
	void calculate()
	{
		double area=(22/7)*(radius*radius);
		double Circumference=2*(22/7)*radius;
		System.out.println("Area : "+area);
		System.out.println("Circumference : "+Circumference);
	}
}
public class Circle_A_C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Circle obj=new Circle(20);
		System.out.println("Before Modification");
		obj.calculate();
		obj.setradius(2);
		System.out.println();
		System.out.println("After Modification");
		obj.calculate();
	}

}
