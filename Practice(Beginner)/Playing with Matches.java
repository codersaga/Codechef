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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=a+b;
		    int sticks[]={6,2,5,5,4,5,6,3,7,6};
	        int sumsticks=0;
	        int r=0;
	        while(c!=0)
	        {
	            r=c%10;
	            sumsticks=sticks[r]+sumsticks;
	            c=c/10;
	        }
	        System.out.println(sumsticks);
		}
	}
}