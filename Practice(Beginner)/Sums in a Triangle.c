#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d",&t);
    for(int q=0;q<t;q++){
        int n;
        scanf("%d",&n);
        int a[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                scanf("%d",&a[i][j]);
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if((a[i][j]+a[i+1][j])>(a[i][j]+a[i+1][j+1]))
                    a[i][j]=a[i][j]+a[i+1][j];
                else
                    a[i][j]=a[i][j]+a[i+1][j+1];
            }
        }
        printf("%d\n",a[0][0]);
    }
    return 0;
}
