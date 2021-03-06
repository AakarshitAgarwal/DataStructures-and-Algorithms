#include<stdio.h>

struct Array{

    int A[10];
    int size;
    int length;
}

void Merge(struct Array *arr1,struct Array *arr2){
    int i,j,k;
    i=j=k=0;

    struct Array *arr3=(struct Array *)malloc(sizeof(struct Array));

    while(i<arr1->length && j<arr2->length)
    {
        if(arr1->A[i]<arr2->A[j])
            arr3->A[k++]=arr1->A[i++];
        else
            arr3->A[k++]=arr2->A[j++];
    }

}

int main(){

    struct Array arr1={{1,22,33,46,57},10,5};
    struct Array arr2={{3,10,25,34,47},10,5};
    struct Array *arr3;
    

    return 0;
}