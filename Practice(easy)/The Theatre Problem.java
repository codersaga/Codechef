/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int max=Integer.MIN_VALUE;
    static void fun(int A[ ],int size,int n,int M[ ][ ]){
        if(size==1){
            int B[ ]=new int[4];
            for(int j=0;j<4;j++)
              B[j]=M[A[j]-1][j];
            Arrays.sort(B);
            int sum=0,p=25;
            for(int j=0;j<n;j++){
                if(B[j]==0)
                  sum=sum-100;
                else
                  sum=sum+(B[j]*p);
                p=p+25;
            }
            if(sum>max)
              max=sum;
        }
        for(int i=0;i<size;i++){
            fun(A,size-1,n,M);
            if((size%2)==1){
                int temp=A[0];
                A[0]=A[size-1];
                A[size-1]=temp;
            }
            else{
                int temp=A[i];
                A[i]=A[size-1];
                A[size-1]=temp;
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception,IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		t=Integer.parseInt(br.readLine( ));
		int ans=0;
		for(int i=0;i<t;i++){
		    int n=Integer.parseInt(br.readLine( ));
		    if(n==0){
		        ans=ans-400;
		        bw.write(-400+"\n");
		        continue;
		    }
		    int M[ ][ ]=new int[4][4];
		    for(int j=0;j<n;j++){
		    String A[ ]=br.readLine( ).split(" ");
		    int c=Integer.parseInt(A[1])/3;
		       M[A[0].charAt(0)-65][c-1]++;
		    }
		    max=Integer.MIN_VALUE;
		    int B[ ]={1,2,3,4};
		    fun(B,4,4,M);
		    ans=ans+max;
		    bw.write(max+"\n");
		}
		bw.write(ans+"\n");
		bw.flush( );
	}
}