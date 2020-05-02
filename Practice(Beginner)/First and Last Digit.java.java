import java.util.Scanner;
class Firstlast
{
	public static void main(String[] args) 
	{
		int T,N,sum,rem;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(int i=0;i<T;i++){
			sum=0;
		        N=sc.nextInt();
			rem=N%10;
			while(N>=10){
				N=N/10;
				sum=N;    
			}
			sum=sum+rem;
			System.out.println(sum);
		}
	}
}