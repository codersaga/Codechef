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
		    String s=sc.next();
		    int countofu=0;
		    int countofd=0;
		    s=s.replaceAll("U+","U").replaceAll("D+","D");
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='U')
		            countofu++;
	            else
	                countofd++;
		    }
		    int ans=Math.min(countofu,countofd);
		    System.out.println(ans);
		}
	}
}
