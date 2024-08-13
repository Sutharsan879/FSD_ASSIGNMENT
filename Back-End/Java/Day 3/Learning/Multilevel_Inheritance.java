package Day_3;
import java.util.*;
class Vehicle
{
	void noofEngine()
	{
		System.out.println("I Have one Engine");
	}
}
class TwoWheeler extends Vehicle
{
	void noofwheels()
	{
		System.out.println("I have two wheels");
	}
}
class bike extends TwoWheeler
{
	void brandName()
	{
		System.out.println("Brand Name is Honda");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		bike bike=new bike();
		bike.noofEngine();
		bike.noofwheels();
		bike.brandName();
	}

}
