/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine( ));
		for(int q=0;q<t;q++){
		    int n=Integer.parseInt(br.readLine( ));
		  //  bw.write((n/2)+"\n");
		    if(n==1){
		        bw.write("1"+"\n");
		        bw.write("1 1"+"\n");
		    }
		    if(n==2){
		        bw.write("1"+"\n");
		        bw.write("1 1 2"+"\n");
		    }
		    if(n>=3){
		        bw.write((n/2)+"\n");
		    
		    bw.write("3 1 2 3"+"\n");
		    int loki=4;
		    for(int j=1;j<((n/2)-1);j++){
		        bw.write("2 "+loki+" "+(loki+1)+"\n");
		        loki=loki+2;
		    }
		    if((n%2)!=0)
		      bw.write("2 "+loki+" "+(loki+1)+"\n");
		    else
		       bw.write("1 "+loki+"\n");
		    }
		}
		bw.flush( );
	}
}