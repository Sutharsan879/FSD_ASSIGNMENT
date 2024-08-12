import java.util.*;
public class Array_Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),o=0,p=0;
	    int a[]=new int[n];
	    int m[]=new int[n];
	    int h[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++) {
	       int c=0;
	       for(int j=0;j<n;j++) {
	    	   if(a[i]==a[j]) {
	    		   c++;
	    	   }
	       }
	       if(c==1) {
	    	   m[o++]=a[i];
	       }
	       else {
	    	   h[p++]=a[i];
	       }
	    }
	    for(int i=0;i<h.length;i++)
	    {
	    	System.out.println(h[i]);
	    }
	    for(int i=0;i<h.length;i++) {
	    	for(int j=0;j<h.length;j++) {
	    		if(h[i]<h[j]) {
	    			int t=h[j];
	    			h[j]=h[i];
	    			h[i]=t;
	    		}
	    	}
	    }
	    for(int i=o;i<n;i++) {
	    	m[i]=h[i];
	    }
	    for(int i=0;i<n;i++) {
	    	System.out.print(m[i]+" ");
	    }
	}

}
