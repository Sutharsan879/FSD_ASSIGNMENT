package Day_3;
class single
{
	void noofwheels()
	{
		System.out.println("I Have Two Wheels");
	}
}
class Bikes extends single
{
	void brandname()
	{
		System.out.println("Brand Name is Honda");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		Bikes bike=new Bikes();
		bike.noofwheels();
		bike.brandname();
	}

}
