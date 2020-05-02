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
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int pNum=0;
            int count=0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num - pNum > k) {
                    if ((num - pNum) % k == 0)
                        count = count + ((num - pNum) / k) - 1;
                    else
                        count = count + ((num - pNum) / k);
                }
                pNum = num;
            }
         
            System.out.println(count);
        }
	}
}
