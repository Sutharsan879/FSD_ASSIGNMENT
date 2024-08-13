package com.wipro;
import java.util.*;
class Dog
{
	String Name;
	String Breed;
	
	Dog(String name,String breed)
	{
		this.Name=name;
		this.Breed=breed;
	}
	
	void setName(String name)
	{
		this.Name=name;
	}
	void setBreed(String breed)
	{
		this.Breed=breed;
	}
	void display()
	{
		System.out.println("Name : "+Name);
		System.out.println("Breed: "+Breed);
	}
}
public class Dog_Instance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Dog a=new Dog("Puppy","Labour Dog");
		Dog b=new Dog("Paal","Dhanush");
		System.out.println("Before Set Method :");
		System.out.println();
		a.display();
		System.out.println();
		b.display();
		a.setName("Paal");
		a.setBreed("Dhanush");
		b.setName("Puppy");
		b.setBreed("Labour Dog");
		System.out.println();
		System.out.println("After Set Method :");
		a.display();
		System.out.println();
		b.display();
	}

}
