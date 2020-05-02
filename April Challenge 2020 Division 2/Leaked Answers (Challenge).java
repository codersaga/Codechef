/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		for(int q=0;q<t;q++){
		    String s[]=br.readLine().split(" ");
		    int n=Integer.parseInt(s[0]);
		    int m=Integer.parseInt(s[1]);
		    int k=Integer.parseInt(s[2]);
		    while(n-->0){
		        int a[]=new int[m+1];
		        String A[]=br.readLine().split(" ");
		        int max=0;
		        int max_idx=0;
		        for(int i=1;i<=k;i++){
		            int x=Integer.parseInt(A[i-1]);  
		            a[x]++;
		            if(max<a[x]){
		                max=a[x];
		                max_idx=x;
		            }
		        }
		        bw.write(max_idx+" ");
		    }
		    bw.newLine();
		}
		bw.flush();
	}
}