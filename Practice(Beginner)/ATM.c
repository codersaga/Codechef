#include<stdio.h>
 
int main()
{
               int withdraw;
               float tot_bal;
               float new_bal;
               scanf("%d",&withdraw);
               scanf("%f",&tot_bal);
               if(withdraw>=tot_bal-0.5 || withdraw % 5!=0)
               {
                       printf("%.2f",tot_bal);
               }
               else
               {
                               new_bal=tot_bal-withdraw-0.5;
                               printf("%.2f",new_bal);
               }
               return 0;
}