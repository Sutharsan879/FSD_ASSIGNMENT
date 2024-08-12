import java.util.*;
public class Biggest_of_two_Numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number 1 :");
		int num1=s.nextInt();
		System.out.println("Enter the Number 2 :");
		int num2=s.nextInt();
		if(num1>num2)
		{
			System.out.println("Biggest Number Is : "+num1);
		}
		else
		{
			System.out.println("Biggest Number Is : "+num2);
		}
	}
}
