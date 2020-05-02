#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    int ans=0;
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
        ans=ans^a[i];
    }
        printf("%d",ans);
    return 0;
}
