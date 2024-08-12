import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=s.nextInt();
		System.out.println("Enter the String :");
		String str=s.nextLine();
		System.out.println("Enter the Salary :");
		float f=s.nextFloat();
		
		System.out.println("Employee ID : "+num);
		System.out.println("Employee Name : "+str);
		System.out.println("Employee Salary : "+f);
	}
}
