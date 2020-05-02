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
	        int n=sc.nextInt();
	        int two=0,zero=0;
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	            if(a[i]==0)
	                zero++;
	            else if(a[i]==2)
	                two++;
	        }
	        System.out.println((zero*(zero-1))/2 + (two*(two-1))/2);
	    }
	}
}
