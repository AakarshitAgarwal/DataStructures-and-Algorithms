#include<stdio.h>

struct Array{

    int A[10];
    int size;
    int length;

};
void swap(int *x,int *y)
 {
 int temp=*x;
 *x=*y;
 *y=temp;
 }
void Display(struct Array arr){
    int i;
    printf("Elements in the array are\n");
    for(i=0;i<arr.length;i++)
    printf("%d ",arr.A[i]);

}
//to modify take it by reference(address) 
void InsertSort(struct Array *arr,int x){

    int i=arr->length-1;
    if(arr->length==arr->size)
    return;
    while ((i>=0 && arr->A[i]>x))
    {
        arr->A[i+1]=arr->A[i];
        i--;
    }
    arr->A[i+1]=x;
    arr->length++;
    
}
//to just check take array by value only
int isSorted(struct Array arr)
{
    int i;
    for(i=0;i<arr.length-1;i++)
    {
        if(arr.A[i]>arr.A[i+1])
        return 0;
    }
    return 1;
}
void Rearrange(struct Array *arr){
    int i,j;
     i=0;
     j=arr->length-1;
    while(i<j)
    {
        while(arr->A[i]<0)i++;  //positive it stops
        while(arr->A[i]>=0)j--;  //negative it stops
        if(i<j)swap(&arr->A[i],&arr->A[j]);
    }
}

int main(){

    struct  Array arr={{-2,3,-4,25,10,-5},10,6};
    // Rearrange(&arr);
    // printf("%d \n",isSorted(arr));
    // InsertSort(&arr,6);
    Display(arr);
    
    return 0;
}