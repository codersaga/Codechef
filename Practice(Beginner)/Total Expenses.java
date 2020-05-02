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
		    double a=sc.nextDouble();
		    double b=sc.nextDouble();
		    double x=a*b;
		    double ans=0;
		    if(a>1000){
		        ans=x-(x*0.1);
		    }
		    else{
		        ans=x;
		    }
		    String str=String.format("%.6f",ans);
		    System.out.println(str);
		}
	}
}
