#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
    int N = 0;

    scanf("%d", &N);
    for (int i = 1; i < N+1; i++) {  
        for (int k = 0; k < i; k++) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}

