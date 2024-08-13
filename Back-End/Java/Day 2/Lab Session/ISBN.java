package com.wipro;
import java.util.*;
class Book
{
	String title;
	String author;
	String ISBN;
	
	Book(String title,String author,double ISBN)
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	
	void display()
	{
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("ISBN : "+ISBN);
	}
}
public class ISBN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book a=new Book("To Kill a Mockingbird", "Harper Lee", "978-0060935467");
		Book b=new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
		
		List<Book> BC=new ArrayList<>();
		
		BC.add(a);
		BC.add(b);
		System.out.println("Before Delete : ");
		a.display();
		System.out.println();
		b.display();
		System.out.println();
		BC.remove(a);
		System.out.println("After Delete : ");
		b.display();
	}

}
