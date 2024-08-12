import java.util.*;
public class Fibnocci_Series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		int temp=0;
		for(int i=0;i<num;i++)
		{
			temp=n1+n2;
			System.out.print(temp+" ");
			n1=n2;
			n2=temp;
		}
	}
}
