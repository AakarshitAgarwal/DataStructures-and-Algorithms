#include<stdio.h>

int main(){
    char A[]="How are you";
    int i;
    int word=1;
    for(i=0;A[i]!='\0';i++){
        if(A[i]=' ' && A[i--]!=' '){
        word++;
        }
    }
    printf("%d",word);
}