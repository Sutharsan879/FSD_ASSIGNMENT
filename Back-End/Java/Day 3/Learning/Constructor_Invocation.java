package Day_3;

class C
{
	C()
	{
		this(5);
		System.out.println("A");
	}
	C(int a)
	{
		super();
		System.out.println("A B");
	}
}
class D extends C
{
	D()
	{
		super(5);
		System.out.println("B");
	}
	D(int a)
	{
		System.out.println("B A");
	}
}
public class Constructor_Invocation {

	public static void main(String[] args) {
		D b=new D(5);
	}

}
