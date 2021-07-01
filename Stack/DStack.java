import java.util.*;

public class DStack {
      
    int capacity =2;  //intial capacity
    int stack[] =new int[capacity];
    int top=0;

    public void push(int data){ 
        // if(top==stack.length){
        //     System.out.println("Stack is full");
        // }

        if(size()==capacity)
            expand();

            stack[top]=data;
            top++;
        
    }

    private void expand() {
        int length=size();
        int newStack[]=new int[capacity*2];

        System.arraycopy(stack,0, newStack,0, length);

        stack=newStack;   //changing the reference for stack name
        capacity *=2;
    }

    public int pop()
    {
        int data=0;

        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
        top--;
        data=stack[top];
        stack[top]=0;
        shrink();
        }
        return data;
        
    }

    private void shrink() {

        int length=size();
        if(length<=(capacity/2)/2){
            capacity=capacity/2;

            int newStack[]=new int[capacity];
            System.arraycopy(stack,0, newStack,0, length);

            stack=newStack;

        }
    }

    public int size()
    {
    
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public int peek(){
    
        int data;
        data=stack[top-1];
        return data;
    }

    public void show(){
    
        for(int n: stack){
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }

}
