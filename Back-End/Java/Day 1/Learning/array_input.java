import java.util.*;
public class array_input {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter the Array Elements : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
