#include <stdio.h>

int main(void) {
    int t;
    scanf("%d",&t);
    for(int q=0;q<t;q++){
        int num,revnum=0,x,temp;
        scanf("%d",&num);
        temp=num;
        while(temp!=0){
            x=temp%10;
            revnum=revnum*10+x;
            temp/=10;
        } 
        if(revnum==num) 
            printf("wins\n");
        else
            printf("losses\n");
    }
    return 0;
}