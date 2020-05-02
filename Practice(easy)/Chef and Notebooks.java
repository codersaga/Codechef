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
		// Scanner sc=new Scanner(System.in);
		try{
		 BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
		
		
		    int t1=Integer.parseInt(br.readLine());
		
		for(int i=0;i<t1;i++)
		{
		    String[] parts = br.readLine().trim().split("\\s+");
		    int x= Integer.parseInt(parts[0]);
		    int y= Integer.parseInt(parts[1]);
		    int k= Integer.parseInt(parts[2]);
		    int n= Integer.parseInt(parts[3]);
		    int np=x-y;
		    int c=n;
		    boolean found=false;
		    //int[] p=new int[n];
		    //int[] r=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        parts = br.readLine().trim().split("\\s+");
		        int p= Integer.parseInt(parts[0]);
		        int r=Integer.parseInt(parts[1]);
		        
		        if(np<=p&&r<=k)
		        {
		            
		           found=true;
		        }
		        
		    }
            System.out.println(found? "LuckyChef":"UnluckyChef");
		}
		 br.close();
		}
		
		catch(IOException e){
            e.printStackTrace();
        }
        catch(NumberFormatException ne)
        {
            System.out.println("no inputs");
        }
       
	}
}
