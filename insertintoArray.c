#include<stdio.h>
#include<stdlib.h>


struct Array{

    int A[10];
    int size;
    int length; 
};

void Display(struct Array arr){

    int i;
    printf("\nElements are\n");
    for(i=0;i<arr.length;i++)
    printf("%d",arr.A[i]);
}

void Append(struct Array *arr,int x)
{
    if(arr->length<arr->size)   //this show there is enough space to append
    arr->A[arr->length++]=x;
}

void Insert(struct Array *arr,int index,int x)  //address of array is taken when we have to modify the array
{
    int i;
    if (index>=0 && index <=arr->length)  //cond.
    {
        /* code */
        for(i=arr->length;i>index;i--)
        arr->A[i]=arr->A[i-1];
        arr->A[index]=x;
        arr->length++;
    }
    

}
int main(){

    struct Array arr={{2,3,4,5,6},10,5};  //10 is size and 5 is length

    //Append(&arr,10);

    Insert(&arr,0,69);
    Display(arr);


    return 0;
    
}