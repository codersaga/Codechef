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
			String x=sc.next();
			String y=sc.next();
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<x.length();i++){
			    if(x.charAt(i)=='B'&&y.charAt(i)=='B'){
				    sb.append('W');
			    } 
			    else{
				    sb.append('B');
			    }
		    }
		    System.out.println(sb.toString());
		}
	}
}