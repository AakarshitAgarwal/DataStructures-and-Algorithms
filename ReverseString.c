// #include<stdio.h>

// int main(){

// char A[]="python";  //mutable
// char B[7];
// int i;
// int j;

// for(i=0;A[i]!='\0';i++){

// }
// i=i-1;
// for(j=0;i>=0;i--,j++){
//     B[j]=A[i];
// }
// B[j]='\0';

// printf("%s",B);
// }

//2nd method

#include<stdio.h>

int main(){

    char A[]="pyhton";
    char t;
    int i,j;
    for(j=0;A[j]!='\0';j++){

    }
    j=j-1;
    for(i=0;i<j;i++,j--){
        t=A[i];
        A[i]=A[j];
        A[j]=t;
    }
    printf("%s",A);
}

