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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine());
		for(int q=0;q<t;q++){
		    String s[]=br.readLine().split(" ");
		    int x=Integer.parseInt(s[0]);
		    int k=Integer.parseInt(s[1]);
		   if(k>=x){
		       bw.write("0"+"\n");
		   }
		  
		   else{
		    int c=0;
		   while(x%2==0){
		       x=x/2;
		       c+=1;
		   }
		   for(int i=3;i<=Math.sqrt(x)+1;i=i+2){
		       while(x%i==0){
		           x=x/i;
		           c+=1;
		       }
		   }
		   if(x>2){
		       c+=1;
		   }
		   if(c>=k){
		       bw.write("1"+"\n");
		   }
		   else{
		       bw.write("0"+"\n");
		   }
		   }
		}
		bw.flush();
	}
}