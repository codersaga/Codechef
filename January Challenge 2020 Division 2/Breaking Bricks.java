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
		    int s=sc.nextInt();
		    int w1=sc.nextInt();
		    int w2=sc.nextInt();
		    int w3=sc.nextInt();
		    if(w1+w2+w3<=s){
		        System.out.println(1);
		    }
		    else if(w1+w2<=s||w2+w3<=s){
		        System.out.println(2);
		    }
		    else{
		        System.out.println(3);
		    }
		}
	}
}
