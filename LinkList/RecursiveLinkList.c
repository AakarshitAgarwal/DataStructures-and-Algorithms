#include<stdio.h>
#include<stdlib.h>

//Node
struct Node{
    int data;
    struct Node *next;
}*first=NULL; //Global pointer

//create linklist
void create(int A[],int n)          //n is number of elements in array
{
    int i;
    struct Node *t,*last;           //t is temporary pointer, last is to add a new node at the end of the linklist
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

    while(p!=NULL)   //we don't know how many node & NULL=0
    {
        printf("%d ",p->data);
        p=p->next;
    }
}

void RDisplay(struct Node *p){
    if(p!=NULL){
        printf("%d ", p->data);
        RDisplay(p->next);
    }
}

int count(struct Node *p){
    int l=0;
    while (p)
    {
        l++;
        p=p->next;
    }
    return l;
}


int Rcount(struct Node *p)  //Recursive count
{
if(p!=NULL)
     return Rcount(p->next)+1;
else
    return 0;
}





int main(){
    struct Node *temp;   //since LFunct is returning node
    int A[]={3,5,7,10,15};
    create(A,5);

    // Display(first);   //PASSING FIRST POINTER

    // RDisplay(first);
    // printf("Length is %d\n\n",count(first));
    // printf("Length is %d\n\n",Rcount(first));
    // // printf("Sum of Linklist data is %d\n\n",Sum(first));
    // printf("Maximum element in the array is %d\n\n",Max(first));
 
    return 0;
}