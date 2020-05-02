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
        long long int x;
        scanf("%lld",&x);
        x=4294967295^x;    
        printf("%lld\n",x);
    }
    return 0;
}
