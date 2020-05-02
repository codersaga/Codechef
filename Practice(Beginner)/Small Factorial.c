#include <stdio.h>

int main(void) {
	int t;
	scanf("%d",&t);
	for(int q=0;q<t;q++){
	    int n;
	    scanf("%d",&n);
	    long int f=1;
	    if(n==0){
	        f=1;
	    }
	    else{
	        for(int i=1;i<=n;i++){
	            f=f*i;
	        }
	    }
	    printf("%ld\n",f);
	}
	return 0;
}

