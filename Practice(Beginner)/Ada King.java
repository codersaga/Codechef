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
		    int count=0;
		    int r=sc.nextInt();
		    int c=sc.nextInt();
		    int k=sc.nextInt();
		    for(int i=1;i<=8;i++){
		        for(int j=1;j<=8;j++){
		           if(Math.abs(r-i)<=k && Math.abs(c-j)<=k){
		               count++;
		           }
		        }
		    }
		    System.out.println(count);
		}
	}
}
