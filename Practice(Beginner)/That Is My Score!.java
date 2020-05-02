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
	    int score=0;
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
            int n=sc.nextInt();
	    	int arr[]={0,0,0,0,0,0,0,0,0,0,0,0};
		    int max=0;
		    for(int j=0;j<n;j++){
                int q=sc.nextInt();
                score=sc.nextInt();
				if(arr[q]<=score){
				    arr[q]=score;
			    }
		    }
		    for(int p=1;p<9;p++){
			    max=max+arr[p];
		    }
		    System.out.println(max);
	    }
	}
}
