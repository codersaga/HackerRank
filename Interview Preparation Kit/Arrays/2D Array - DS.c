#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    int a[6][6];
    for(int i=0;i<6;i++){
        for(int j=0;j<6;j++){
            scanf("%d",&a[i][j]);
        }
    }
    int phg,sum=-1000;
    for(int i=1;i<5;i++){
        for(int j=1;j<5;j++){
            phg=0;
            phg+=a[i-1][j-1];
            phg+=a[i-1][j];
            phg+=a[i-1][j+1];
            phg+=a[i][j];
            phg+=a[i+1][j-1];
            phg+=a[i+1][j];
            phg+=a[i+1][j+1];
            if(phg>sum){
                sum=phg;
            }
        }
        
    }
    printf("%d",sum);
    return 0;
}
