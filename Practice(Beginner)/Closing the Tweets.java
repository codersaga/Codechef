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
		int x=sc.nextInt();
		int n=sc.nextInt();
		int c=0;
		int a[]=new int[x];
		for(int i=0;i<n;i++){
		    String s=sc.next();
		    if(s.equals("CLICK")){
		        int t=sc.nextInt();
		        if(a[t-1]==0)
		        {
		            a[t-1]=1;
		            c++;
		        }
		        else if(a[t-1]==1)
		        {
		            a[t-1]=0;
		            c--;
		        }
		    }
		    else
		    {
		        for(int j=0;j<x;j++)
		            a[j]=0;
		        c=0;
		    }
		    System.out.println(c);
		}
	}
}
