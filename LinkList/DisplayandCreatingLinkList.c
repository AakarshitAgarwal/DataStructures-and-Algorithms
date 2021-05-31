#include<stdio.h>
#include<stdlib.h>

//Node
struct Node{
    int data;
    struct Node *next;
}*first=NULL; //Global pointer , or struct Node *head;



//create linklist
void create(int A[],int n)          //n is number of elements in array
{
    int i;
    struct Node *t,*last;        //t is temporary pointer
    
    //struct Node *last = new Node(first,head); we created a last Node which help us to put the data of the previous node in to next node u will the point ahead.

    first=(struct Node*)malloc(sizeof(struct Node));
    first->data=A[0];
    first->next=NULL; 
    last=first;  //in last pointer we store the address of the head for temporary.
    
    //all other nodes after firat are made through loop
    for (i = 1; i < n; i++)   //started from 1 since 0 node is created
    {
        t=(struct Node*)malloc(sizeof(struct Node));   // (again created Node in heap)
        t->data=A[i];
        t->next=NULL;  
        last->next=t;  // (now in this step we are putting the address of t in the last->next which means the first Node which we created its next section. so now first node has address of this new created node in it. so now they are linked.)
        last=t;   // (and now we storing the address of t in last so that for next element we can repeat the same step  in order.)
    }
    
}

void Display(struct Node *p){

    while(p!=NULL)   //we don't know how many node & NULL=0
    {
        printf("%d ",p->data);
        p=p->next;
    }
}

int main(){
    int A[]={3,5,7,10,15};
    create(A,5);

    Display(first);   //PASSING FIRST POINTER

    return 0;
}