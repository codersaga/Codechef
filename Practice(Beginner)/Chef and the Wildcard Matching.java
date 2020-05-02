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
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int q=0;q<t;q++){
			String s1=sc.next();
			String s2=sc.next();
			int a=0,flag=0;
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)=='?'||s2.charAt(i)=='?'){
					a++;
				}
				else if(s1.charAt(i)==s2.charAt(i)){
					a++;
				}
				else{
				    flag=1;
				    break;
			    }
			}
			if(flag==1)
			    System.out.println("No");
			else
			    System.out.println("Yes");
		}
	}
}
