// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    printf("Hello world");
    char arr[20];
    scanf("%[^\n]s",arr);
    char * ptr=&arr;
    while(*ptr!='\0'){
        printf("%c",*ptr);
        ptr++;
    }
    

    return 0;
}