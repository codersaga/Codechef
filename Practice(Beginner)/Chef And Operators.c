#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	scanf("%d",&t);
	for(int q=0;q<t;q++){
	    int a,b;
	    scanf("%d%d",&a,&b);
	    if(a>b)
	        printf(">\n");
	    else if(a<b)
	        printf("<\n");
	    else
	        printf("=\n");
	}
	return 0;
}

