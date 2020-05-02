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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int temp[]=new int[n];
		    for(int i=0;i<n;i++){
		        if(a[i]%4==0){
		            temp[i]=2;
		        }
		        if(a[i]%2==0&&a[i]%4!=0){
		            temp[i]=1;
		        }
		        if(a[i]%2!=0){
		            temp[i]=0;
		        }
		    }
		    long ans=0;
		    long ans1=0;
		    long ans2=0;
		    ans=0;
		    int flag=0;
		    for(int i=n-1;i>=0;i--){
		        
		        if(temp[i]==2){
		            ans=ans+n-i;
		            ans2=(long)(n-i);
		            ans1=ans2;
		        }
		        if(temp[i]==1){
		            if((ans1>ans2)){
		                ans=ans+ans1;
		                ans2=ans1;
		                ans1=(long)(n-i);
		            }
		            else{
		                ans+=ans1;
		                ans1=(long)(n-i);
		            }
		        }
		        if(temp[i]==0){
		            ans+=ans2;
		        }
		    }
		  //for(int i=0;i<n;i++){
		  //    System.out.print(b[i]+" ");
		  //}
		  long c=0;
		  for(int i=0;i<n;i++){
		      if(temp[i]==0){
		          c++;
		          ans=ans+c;
		      }
		      else{
		          c=0;
		      }
		  }
		  System.out.println(ans);
		}
	}
}