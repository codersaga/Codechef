import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;
public class Main{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n,t,cs=1;
     t=sc.nextInt();
	 while(t>=cs){
		 n=sc.nextInt();

     BigInteger factorial = BigInteger.ONE;

     for (int i=1; i<=n; i++) {
         factorial = factorial.multiply(BigInteger.valueOf(i));
     }
     System.out.println(factorial);
     cs=cs+1;
	 }


 }
}