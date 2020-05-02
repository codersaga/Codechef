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
		        int count=0;
		        while(n!=0){
		            int x=(int)Math.sqrt(n);
		            count++;
		            n=n-x*x;
		        }
		        System.out.println(count);
		    }
	}
}
