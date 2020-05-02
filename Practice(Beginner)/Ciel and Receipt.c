#include <stdio.h>

int main(void) {
	int t;
	scanf("%d",&t);
	for(int q=0;q<t;q++){
	    int item=0;
	    long int p;
		scanf("%ld",&p);
	    if(p>2048){
		    item+=p/2048;
		    p=p%2048;
	    }
		while(p){
			if(p%2)
			    item++;
		    	p=p/2;
	   }
	   printf("%d\n",item);
	    
	}
	return 0;
}