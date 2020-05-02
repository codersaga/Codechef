/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int q=0;q<t;q++){
		    long ans=0;
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        b[j]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    for(int k=0;k<n;k++){
		        ans=ans+Math.min(a[k],b[k]);
		    }
		    System.out.println(ans);
		}
	}
}
