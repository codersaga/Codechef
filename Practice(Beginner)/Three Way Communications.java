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
			int r=sc.nextInt();
			int a[][]=new int[3][2];
			for(int i=0;i<3;i++){
				for(int j=0;j<2;j++){
					a[i][j]=sc.nextInt();
				}
			}
			double d1=Math.sqrt(Math.pow((a[1][0]-a[0][0]),2)+Math.pow((a[0][1]-a[1][1]),2));
			double d2=Math.sqrt(Math.pow((a[1][0]-a[2][0]),2)+Math.pow((a[1][1]-a[2][1]),2));
			double d3=Math.sqrt(Math.pow((a[0][0]-a[2][0]),2)+Math.pow((a[0][1]-a[2][1]),2));
			if((r>=d1&&r>=d2)||(r>=d1&&r>=d3)||(r>=d2&&r>=d3))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}