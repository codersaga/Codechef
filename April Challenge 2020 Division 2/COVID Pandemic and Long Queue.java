/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt( );
	   	loki: for(int i=0;i<t;i++){
		   int n=sc.nextInt( );
		   int a[ ]=new int[n];
		   for(int j=0;j<n;j++)
		      a[j]=sc.nextInt( );
		   int temp;
		   if(a[0]==0)
		     temp=-1;
		   else
		      temp=0;
		   for(int j=1;j<n;j++){
		       if(a[j]==1 && temp!=-1 && j-temp<6){
		           System.out.println("NO");
		           continue loki;
		       }
		       else if(a[j]==1)
		         temp=j; 
		   }
		   System.out.println("YES");
		}
	}
}