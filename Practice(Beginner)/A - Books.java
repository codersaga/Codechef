import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int q=0;q<t;q++){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int b[]=new int[n];
		    for(int i=n-1;i>=0;i--){
			    if(i==n-1){
				    b[i]=0;
			    }
			    else if(a[i]!=a[i+1]){
				    b[i]=n-1-i;
			    }
			    else{
				    b[i]=b[i+1];
			    }
		    }
			for(int i=0;i<n;i++){
				System.out.print(b[i]+" ");
			}
			System.out.println();
		}
	}
}