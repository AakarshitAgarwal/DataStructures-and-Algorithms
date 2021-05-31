#include<stdio.h>


struct Array
{
    /* data */
    int A[10];
    int size;
    int length;
};

int LinearSearch(struct Array arr,int key)
{
    /* data */
    int i;
    for(i=0;i<arr.length;i++){
        if(key==arr.A[i])
        return i;
    }
    return -1;
}

int main(){

    struct Array arr={{2,3,4,5,6},10,5};

    printf("%d\n",LinearSearch(arr,5));

    return 0;
    
}