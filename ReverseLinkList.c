#include<stdio.h>
#include<stdlib.h>

//Node
struct Node{
    int data;
    struct Node *next;  
}*first=NULL; //Global pointer , Head

//create linklist
void create(int A[],int n)          //n is number of elements in array
{
    int i;
    struct Node *t,*last;           //t is temporary pointer, last is to add a new node at the end of the linklist
    first=(struct Node*)malloc(sizeof(struct Node));
    first->data=A[0];
    first->next=NULL;
    last=first;
    
    //all other nodes after firat are made through loop 
    for (i = 1; i < n; i++)   //started from 1 since 0 node is created
    {
        t=(struct Node*)malloc(sizeof(struct Node));
        t->data=A[i];
        t->next=NULL;
        last->next=t;  
        last=t;   //t become the new node
    }
    
}

//Display the linklist
void Display(struct Node *p){

    while(p!=NULL)   //we don't know how many node & NULL=0
    {
        printf("%d ",p->data);
        p=p->next;
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

//Reversing of a linklist
void Reverse1(struct Node *p){
    int *A,i=0;
    struct Node *q=p;
    A=(int *)malloc(sizeof(int)*count(p));  //creating array of same size as linlist

    while (q!=NULL)
    {
        /* code */
        A[i]=q->data;
        q=q->next;
        i++;
    }
    q=p;  //q should again start with first pointer i.e p
    i--;
    while ((q!=NULL))
    {
        q->data=A[i];
        q=q->next;
        i--;
    }
}


int main(){
    // struct Node *temp;   //since LFunct is returning node
    int A[]={1,2,3,4,5};
    create(A,5);

    // printf("Deleted Element is %d\n",Delete(first,1));
    Reverse1(first);
    Display(first);    
    printf("\n\n");
        
    return 0;
}