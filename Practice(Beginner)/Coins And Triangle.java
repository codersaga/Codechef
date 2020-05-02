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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=s.nextInt();
		    int count=0;
		    int num=1;
		    while(n>0 && n>=num)
		    {
		        count++;
		        n=n-num;
		        num++;
		    }
		    System.out.println(count);
		   
		}
	}
}
