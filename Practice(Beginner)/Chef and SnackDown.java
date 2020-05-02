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
		    if(n==2010||n==2015||n==2016||n==2017||n==2019)
		        System.out.println("HOSTED");
	        else
	            System.out.println("NOT HOSTED");
		}
	}
}
