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
    int t;
    scanf("%d",&t);
    for(int q=0;q<t;q++){
        long long int n;
        scanf("%lld",&n);
        long long int k ;
        int winner=1;
        while(n!=1){
            if(n&&!(n&(n-1)))
                n/=2;
            else{
                k=pow(2,floor(log2(n)));
                n-=k;
            }
            if(winner)
                winner=0;
            else
                winner=1;
        }
        if(winner)
            printf("Richard\n");
        else
            printf("Louise\n");
    }
    return 0;
}
