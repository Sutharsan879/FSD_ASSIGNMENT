import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		int count=0;
		int temp=num;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		int sum=0;
		temp=num;
		while(num>0)
		{
			int rem=num%10;
			sum+=(Math.pow(rem,count));
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}

}
