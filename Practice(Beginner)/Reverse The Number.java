import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{ 	 
			StringBuffer sb=new StringBuffer();
	    		sb.append(sc.next());
	    		String rev=(sb.reverse()).toString();
	    		System.out.println(Integer.valueOf(rev));
		}
	}
}