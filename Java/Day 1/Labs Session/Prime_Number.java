import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		int temp=0;
		if(num==0||num==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					temp=1;
				}
			}
			if(temp==1)
			{
				System.out.println("Not Prime");
			}
			else
			{
				System.out.println("Prime Number");
			}
		}
	}

}
