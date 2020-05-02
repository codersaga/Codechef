/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        // your code goes here
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    sc.nextLine();
		    for(int q=0;q<t;q++){
		        String a=sc.nextLine();
		        String b=sc.nextLine();
		        boolean bZero=true;
		        for(int i=0;i<b.length();i++){
				    if(b.charAt(i)=='1'){
					    bZero=false;
					    break;
				    }
			    }
			    int m=a.length()-1;
			    int n=b.length()-1;
			    int maxCarry=0;
			    int curCarry=0;
			    int car=0;
			    while(m>=0&&n>=0){
				    if(car==0){
					    if(a.charAt(m)=='1'&&b.charAt(n)=='1'){
						    car=1;
						    curCarry++;
					    }
				    }
				    else{
					    if(a.charAt(m)=='1'&&b.charAt(n)=='1'){
						    car=1;
						    maxCarry=Math.max(maxCarry,curCarry);
						    curCarry=1;
					    }
					    else if(a.charAt(m)=='1'||b.charAt(n)=='1'){
						    car=1;
						    curCarry++;
					    }
					    else{
						    car=0;
					    }
				    }
				    if(car==0){
					    maxCarry=Math.max(maxCarry,curCarry);
					    curCarry=0;
				    }
				    m--;
				    n--;
			    }
			    while(m>=0&&car>0){
				    if(car!=0){
					    if(a.charAt(m)=='1'){
						    car=1;
						    curCarry++;
					    }
					    else{
						    car=0;
					    }
				    }
				    if(car==0){
					    maxCarry=Math.max(maxCarry,curCarry);
					    curCarry=0;
				    }
			    	m--;
			    }
			    while(n>=0&&car>0){
					if(car!=0){
						if(b.charAt(n)=='1'){
							car=1;
							curCarry++;
						}
						else{
							car=0;
						}
					}
					if(car==0){
						maxCarry=Math.max(maxCarry,curCarry);
						curCarry=0;
					}
					n--;
				}
			    maxCarry=Math.max(maxCarry,curCarry);
			    int sol=0;
			    if(bZero){
				    System.out.println(sol);
			    }
			    else{
				    sol=1+maxCarry;
				    System.out.println(sol);
			    }
		    }
		    sc.close();
		}
		catch (Exception e) {
		}
	}
}
