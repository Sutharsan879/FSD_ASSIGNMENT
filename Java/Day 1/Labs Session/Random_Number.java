import java.util.*;
public class Random_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		int random=(int)(Math.random()*num);
		System.out.println("Random Number is : "+random);
	}
}
