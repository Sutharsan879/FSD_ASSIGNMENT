import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
