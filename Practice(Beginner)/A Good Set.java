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
            int n=sc.nextInt();
            for(int i=0;i<n;i++ ){
                System.out.print((2*i+1)+" ");
            }
            System.out.println();
        }
	}
}
