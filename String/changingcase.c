#include<stdio.h>

int main(){
    char A[]="AbCdEfGh";
    int i;
    for(i=0;A[i]!='\0';i++){
        if(A[i]>=65 && A[i]<=122)
            A[i]+=32;
        else if(A[i]>='a' && A[i]<=122)
            A[i]-=32;
    }
    printf(A);

    return 0;
}