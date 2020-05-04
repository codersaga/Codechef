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
		    String str=sc.next();
		    int c[]=new int[26];
		    for(int i=0;i<26;i++)
		        c[i]=0;
		    int ind=0;
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<str.length();i++){
		        int index=str.charAt(i)-'a';
		        c[index]++;
		        if(c[index]>max)
		        {
		        max=c[index];
		        ind=index;
		        }
		    }
		    int sum=0;
		    for(int i=0;i<26;i++){
		        if(i!=ind)
		        sum=sum+c[i];
		    }
		    if(sum==max)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
