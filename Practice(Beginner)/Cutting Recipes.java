/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int gcd(int x,int y){
        if(x==0){
            return y;
        }
        return (gcd(y%x,x));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int q=0;q<t;q++){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int temp=a[0];
		    for(int i=1;i<n;i++){
		        temp=gcd(temp,a[i]);
		    }
		    for(int i=0;i<n;i++) {
		        System.out.print(a[i]/temp+" ");
		    }
		    System.out.println();
		}
	}
}
