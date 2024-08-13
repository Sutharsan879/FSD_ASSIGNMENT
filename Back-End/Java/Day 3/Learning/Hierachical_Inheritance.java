package Day_3;

class Football
{
	void players() 
	{
		System.out.println("parent");
	}
}
class Child extends Football
{
	void player1() 
	{
		System.out.println("Child");
	}
}
class subchild extends Football
{
	void player2() 
	{
		System.out.println("Child class Two");
	}
}
public class Hierachical_Inheritance
{
	public static void main(String[] args) 
	{
		Child a=new Child();
		a.player1();
		a.players();
		System.out.println();
		subchild b=new subchild();
		b.player2();
		b.players();
	}
}