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
        last=t;   //t become the new node
    }
    
}

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

//Insertion in the LinkList
void Insert(struct Node *p,int index,int x){
    
    struct Node *t;  //temporary pointer 
    int i;
    if(index < 0 || index > count(p))
    return;
    t=(struct Node *)malloc(sizeof(struct Node));  //new node
    t->data=x;


//Insertion at first node
    if(index ==0){
        t->next=first;
        first=t;
    }
    else
    {
        for(i=0;i<index-1;i++)
        p=p->next;
        t->next=p->next;
        p->next=t;
    }
    
}

//Insertion in a sorted List
void SortedInsert(struct Node *p,int x)
{
    struct Node *t,*q=NULL;   //q is a taling pointer
    t=(struct Node*)malloc(sizeof(struct Node));
    t->data=x;
    t->next=NULL;

    if(first==NULL)   //if first node is NULL
        first=t;
    else
        {
        while (p && p->data<x)     //reaching position
        {
            q=p;
            p=p->next;
        }
        if(p==first)    // 1)if p is the first node
        {
            t->next=first;
            first=t;
        }
        else      //2)if p is between nodes
        {
            t->next=q->next;
            q->next=t;
        }
        
        }
        
}


int main(){
    // struct Node *temp;   //since LFunct is returning node
    int A[]={3,5,7,10,15};
    create(A,5);
    // Insert(first,5,10);
    SortedInsert(first,6);

    Display(first);    
    printf("\n\n");
        
    return 0;
}