#include<stdio.h>
#include<stdlib.h>

//Node
struct Node{
    int data;
    struct Node *next;
}*first=NULL,*second=NULL,*third=NULL; //Global pointer , or struct Node *head;



//create linklist 1
void create1(int A[],int n)          //n is number of elements in array
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

//create linklist 2
void create2(int A[],int n)          
{
    int i;
    struct Node *t,*last;         
    
    second=(struct Node*)malloc(sizeof(struct Node));
    second->data=A[0];
    second->next=NULL; 
    last=second;  
    
    for (i = 1; i < n; i++)   
    {
        t=(struct Node*)malloc(sizeof(struct Node));   
        t->data=A[i];
        t->next=NULL;  
        last->next=t;  
        last=t;   
    }
    
}


// //Concatination of linkList

// void Concat(struct Node *p,struct Node *q){
//     third=p;

//     while(p->next!=NULL){
//         p=p->next;
//     }
//         p->next=q;
// }

//Merging of LinkList

void Merge(struct Node *p,struct Node *q){

    struct Node *last;
    if(p->data < q->data){
        third =last=p;
        p=p->next;
        third->next=NULL;
    }
    else{
    third =last=q;
    q=q->next;
    third->next=NULL;
    }
    while (p!=NULL && q!=NULL)
    {
        if (p->data< q->data)
        {
            last->next=p;
            last=p;
            p=p->next;
            last->next=NULL;
        }
        else
        {   
            last->next=q;
            last=q;
            q=q->next;
            last->next=NULL;
        }   
    }
    if(p!=NULL)last->next=p;
    if(q!=NULL)last->next=q;
}

void Display(struct Node *p){

    while(p!=NULL)   //we don't know how many node & NULL=0
    {
        printf("%d ",p->data);
        p=p->next;
    }
}

int main(){
    int A[]={10,20,30,40,50};
    int B[]={5,15,25,35,45};
    create1(A,5);
    create2(B,5);
    
    // printf("First\n");
    // Display(first);   //PASSING FIRST POINTER
    // printf("\n\n");
    
    // printf("Second\n");
    // Display(second);
    // printf("\n\n");

    // Concat(first,second);
    // Display(third);

    Merge(first,second);

    Display(third);
    printf("\n\n");

    return 0;
}