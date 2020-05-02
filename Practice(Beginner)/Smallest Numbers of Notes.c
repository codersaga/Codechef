#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	scanf("%d",&t);
    for(int q=0;q<t;q++){
        int n;
        scanf("%d",&n);
        int a,b,c,d,e,f,g;
        a=(n/100);
        b=((n%100)/50);
        c=((((n%100)%50))/10);
        d=(((((n%100)%50))%10)/5);
        e=((((((n%100)%50))%10)%5)/2);
        f=(((((((n%100)%50))%10)%5)%2)/1);
        g=a+b+c+d+e+f;
        printf("%d\n",g);
    }
    return 0;
}