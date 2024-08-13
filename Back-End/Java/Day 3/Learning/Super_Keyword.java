package Day_3;
// Super Keyword

class A
{
	int a=10;
	A (String Name)
	{
		System.out.println("Welcome "+Name);
	}
	void myMethod()
	{
		System.out.println("I am a Super class Method");
	}
}
class B extends A
{
	B()
	{
		super("Sutharsan");
	}
	void myMethod()
	{
		System.out.println("Super Class Variable : "+super.a);
		super.myMethod();
	}
}

public class Super_Keyword {

	public static void main(String[] args) {
		B b=new B();
		b.myMethod();
	}
}
