#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
    int maxAnd=0,maxOr=0,maxXor=0;
    for(int i=1;i<=n;i++){
        for(int j=i+1;j<=n;j++){
            if(maxAnd<(i&j)&&(i&j)<k)
                maxAnd=i&j;
            if(maxOr<(i|j)&&(i|j)<k)
                maxOr=i|j;
            if(maxXor<(i^j)&&(i^j)<k)
                maxXor=i^j;
        }
    }
    printf("%d\n",maxAnd);
    printf("%d\n",maxOr);
    printf("%d\n",maxXor);
 
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
