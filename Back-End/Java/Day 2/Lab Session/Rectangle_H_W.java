package com.wipro;
import java.util.*;
class Rectangle
{
	double width;
	double height;
	
	Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	
	void calculatearea()
	{
		double area=width*height;
		System.out.println("Area : "+area);
	}
	void calculateperi()
	{
		double peri=2*(width)+2*(height);
		System.out.println("Perimeter : "+peri);
	}
	
}
public class Rectangle_H_W {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Rectangle obj=new Rectangle(10,20);
		obj.calculatearea();
		obj.calculateperi();
	}

}
