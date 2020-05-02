#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char** split_string(char*);

// Complete the countApplesAndOranges function below.
void countApplesAndOranges(int s, int t, int a, int b, int apples_count, int* apples, int oranges_count, int* oranges) {
}

int main()
{
    int s,t;
    int count1=0,count2=0;
    scanf("%d%d",&s,&t);
    int a,b;
    scanf("%d%d",&a,&b);
    int m,n;
    scanf("%d%d",&m,&n);
    int temp;
    for(int i=0;i<m;i++){
        scanf("%d",&temp);
        if(temp+a>=s&&temp+a<=t){
            count1++;
        }
    }
    for(int j=0;j<n;j++){
        scanf("%d",&temp);
        if(temp+b>=s&&temp+b<=t){
            count2++;
        }
    }
    printf("%d\n",count1);
    printf("%d",count2);
    return 0;
}

char* readline() {
    size_t alloc_length = 1024;
    size_t data_length = 0;
    char* data = malloc(alloc_length);

    while (true) {
        char* cursor = data + data_length;
        char* line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line) { break; }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') { break; }

        size_t new_length = alloc_length << 1;
        data = realloc(data, new_length);

        if (!data) { break; }

        alloc_length = new_length;
    }

    if (data[data_length - 1] == '\n') {
        data[data_length - 1] = '\0';
    }

    data = realloc(data, data_length);

    return data;
}

char** split_string(char* str) {
    char** splits = NULL;
    char* token = strtok(str, " ");

    int spaces = 0;

    while (token) {
        splits = realloc(splits, sizeof(char*) * ++spaces);
        if (!splits) {
            return splits;
        }

        splits[spaces - 1] = token;

        token = strtok(NULL, " ");
    }

    return splits;
}
