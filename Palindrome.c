#include<stdio.h>

 int main(){
     char A[]="madamss";
     int i,j;

     for(j=0;A[j]!='\0';j++){

    }
     j=j-1;

     for(i=0;i<j;i++,j--){
    if(A[i]>=A[j]){
        printf("Number is palindrome");
    } 
    else
    {
        printf("Number is not palindrome");
    }    
    }
    
    

 }