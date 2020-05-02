import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
		for(int p=0;p<t;p++){
		    long sum=0;
		    int n=sc.nextInt();
		    ArrayList<Integer> al=new ArrayList();
		    for(int i=0;i<n;i++){
		        al.add(sc.nextInt());
		    }
		    Collections.sort(al);
		    Collections.reverse(al);
		    int year=0;
		    int ele=0;
		    for(int i=0;i<n;i++){
		        if(al.get(i)-year>0){
		            ele=al.get(i)-year;
		        }
		        else{
		            break;
		        }
		        sum=(sum+ele)%(int)(1e9+7);
		        year++;
		    }
		    System.out.println(sum%(int)(1e9+7));
		}
	}
}