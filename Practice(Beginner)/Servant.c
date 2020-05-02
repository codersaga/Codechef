#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	scanf("%d",&t);
	for(int q=0;q<t;q++){
	    int n;
	    scanf("%d",&n);
	    if(n<10){
	        printf("What an obedient servant you are!\n");
	    }
	    else{
	        printf("-1\n");
	    }
	}
	return 0;
}

