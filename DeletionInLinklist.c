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

//Deletion in LinkList
int Delete(struct Node *p,int index){
    struct Node *q;
    int x=-1,i;

    if(index <1 || index >count(p)){
        return -1;  //nothing returned
    }
    if(index==1)
    {
        q=first;
        x=first->data;
        first=first->next;
        free(q);     //delete is used in c++ while free is used in c
        return x;
    }
    else
    {
        for(i=0;i<index-1;i++){

            q=p;
            p=p->next;
        }
        q->next=p->next;
        x=p->data;
        free(p);
        return x;
    }
    
}


int main(){
    // struct Node *temp;   //since LFunct is returning node
    int A[]={3,5,7,10,15};
    create(A,5);

    printf("Deleted Element is %d\n",Delete(first,1));
    
    Display(first);    
    printf("\n\n");
        
    return 0;
}