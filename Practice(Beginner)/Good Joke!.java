import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    for(int q=0;q<t;q++){
	        int n=s.nextInt();
	        int c=0;
	        while(n>0){
	            int a=s.nextInt();
	            int b=s.nextInt();
	            c^=n;
	            n--;
	        }
	        System.out.println(c);
	    }
	}
}
