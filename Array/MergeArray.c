#include<stdio.h>
#include<stdlib.h>

struct Array{

    // int A[10];  //constant size
    int *A;        //For Menu-driven
    int size;
    int length;
};

void Display(struct Array arr){
    int i;
    printf("Elements in the array are\n");
    for(i=0;i<arr.length;i++)
    printf("%d ",arr.A[i]);

}

struct Array* Merge(struct Array *arr1,struct Array *arr2)  //why fuction is struct pointer
{
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
    //for comparing the last element
    for(;i<arr1->length;i++)
        arr3->A[k++]=arr1->A[i];
    for(;j<arr2->length;j++)
        arr3->A[k++]=arr2->A[j];

    //increase the size    
    arr3->length=arr1->length+arr2->length;
    arr3->size=10;

    return arr3;
    
}

struct Array* Union(struct Array *arr1,struct Array *arr2)  //why fuction is struct pointer
{
    int i,j,k;
    i=j=k=0;

    struct Array *arr3=(struct Array *)malloc(sizeof(struct Array));

    while(i<arr1->length && j<arr2->length)
    {
        if(arr1->A[i]<arr2->A[j])
            arr3->A[k++]=arr1->A[i++];
        else if(arr2->A[j]<arr1->A[i])
            arr3->A[k++]=arr2->A[j++];
        else{
            arr3->A[k++]=arr1->A[i++];
            j++;
        }
    }
    //for comparing the last element
    for(;i<arr1->length;i++)
        arr3->A[k++]=arr1->A[i];
    for(;j<arr2->length;j++)
        arr3->A[k++]=arr2->A[j];

    //increase the size in case of Union
    arr3->length=k;
    arr3->size=10;

    return arr3;
    
}

struct Array* Intersection(struct Array *arr1,struct Array *arr2)  //why fuction is struct pointer
{
    int i,j,k;
    i=j=k=0;

    struct Array *arr3=(struct Array *)malloc(sizeof(struct Array));

    while(i<arr1->length && j<arr2->length)
    {
        if(arr1->A[i]<arr2->A[j])
            i++;
        else if(arr2->A[j]<arr1->A[i])
            j++;
        else{
            arr3->A[k++]=arr1->A[i++];
            j++;
        }
    }

    //increase the size in case of Union
    arr3->length=k;
    arr3->size=10;

    return arr3;    
}

struct Array* Difference(struct Array *arr1,struct Array *arr2)  //why fuction is struct pointer
{
    int i,j,k;
    i=j=k=0;

    struct Array *arr3=(struct Array *)malloc(sizeof(struct Array));

    while(i<arr1->length && j<arr2->length)
    {
        if(arr1->A[i]<arr2->A[j])
            arr3->A[k++]=arr1->A[i++];
        else if(arr2->A[j]<arr1->A[i])
            j++;
        else{
            i++;
            j++;
        }
    }
    //for comparing the last element
    for(;i<arr1->length;i++)
        arr3->A[k++]=arr1->A[i];


    //increase the size in case of Union
    arr3->length=k;
    arr3->size=10;

    return arr3;
    
}

int main(){

    struct Array arr1={{1,3,33,40,57},10,5};
    struct Array arr2={{3,10,25,40,47},10,5};
    struct Array *arr3;
    // arr3=Merge(&arr1,&arr2);
    // // arr3=Union(&arr1,&arr2);
    // arr3=Intersection(&arr1,&arr2);
    arr3=Difference(&arr1,&arr2);

    Display(*arr3);
    

    return 0;
}