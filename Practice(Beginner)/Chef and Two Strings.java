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
		int t=sc.nextInt();
		for(int q=0;q<t;q++){
		    int i;
		    String s1=sc.next();String s2=sc.next();
		    int c=0,d=0;
		    int l=s1.length();
		    for(i=0;i<l;i++)
		    {
		        char c1=s1.charAt(i);char c2=s2.charAt(i);
		        if(c1>='a'&&c1<='z'&&c2>='a'&&c2<='z'&&c1!=c2)
		            c++;
		        else if(c1=='?'||c2=='?')
		            d++;
		    }
		    d+=c;
		    System.out.print(c+" "+d);
		    System.out.println();
	    }
	}
}
