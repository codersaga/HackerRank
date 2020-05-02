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
    int xor,max=0;
    int l,r;
    scanf("%d",&l);
    scanf("%d",&r);
    for(int i=l;i<=r;i++){
        for(int j=i;j<=r;j++){
            xor=i^j;
            if(xor>max)
                max=xor;
        }
    }
    printf("%d",max);
    return 0;
}
