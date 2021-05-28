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

int main(){
    // struct Node *temp;   //since LFunct is returning node
    int A[]={3,5,7,10,15};
    create(A,5);
    Insert(first,8,10);

    Display(first);    
        
    return 0;
}