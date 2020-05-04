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
		    int counta=0;
		    int countb=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='a')
		            counta++;
	            else
	                countb++;
		    }
		    System.out.println(Math.min(counta,countb));
		}
	}
}
