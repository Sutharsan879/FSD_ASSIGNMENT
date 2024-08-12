import java.util.*;
public class PROGRAM_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=s.nextInt();
		System.out.println("Enter the Array Elements");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		int count=0;
		int br[]=new int[num];
		for(int i=0;i<num;i++)
		{
			count=0;
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
					count=1;
				}
			}
			if(count==0)
			{
				br[i]=arr[i];
				System.out.print(br[i]);
			}
		}
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			l.add(br[i]);
		}
		System.out.println(l);
	}
}
