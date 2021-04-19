#include<stdio.h>
#include<stdlib.h>

//Node
struct Node{
    int data;
    struct Node *next;
}*first=NULL;

//create linklist
void create(int A[],int n)          //n is number of elements in array
{
    int i;
    struct Node *t,*last;           //t is temporary pointer
    first=(struct Node*)malloc(sizeof(struct Node));
    first->data=A[0];
    first->next=NULL;
    last=first;
    
    for (i = 1; i < n; i++)   //started from 1 since 0 node is created
    {
        t=(struct Node*)malloc(sizeof(struct Node));
        t->data=A[i];
        t->next=NULL;
        last->next=t;  
        last=t;   //last become the new node
    }
    
}

void Display(struct Node *p){

    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

int main(){
    int A[]={3,5,7,10,15};
    create(A,5);

    Display(first);

    return 0;
}