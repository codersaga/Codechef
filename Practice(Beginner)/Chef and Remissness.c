#include <stdio.h>

int main(){
    int t;
    scanf("%d",&t);
    for(long int q=0;q<t;q++){
        long int num1,num2;
        long int sum;
        scanf("%ld%ld",&num1,&num2);
        if(num1>num2)
            printf("%ld ",num1);
        else
            printf("%ld ",num2);
        sum=num1+num2;
        printf("%ld",sum);
        printf("\n");
    }
    return 0;
}