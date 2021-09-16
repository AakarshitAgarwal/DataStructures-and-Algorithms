import java.util.*;

public class ReverseLL {


    static Node head;


    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        node=prev;
        return node;
    }

    void printLL(Node node){
        while(node!=null){
            System.out.println(node.data+" ");
            node=node.next;
        }
    }

    public static void main(String args[]){
        ReverseLL list=new ReverseLL();
        list.head=new Node(85);
        list.head.next=new Node(15);
        list.head.next.next=new Node(25);
        list.head.next.next.next=new Node(35);
        
        

        System.out.println("Given LinkList");
        list.printLL(head);
        head=list.reverse(head);
        System.out.println("");
        System.out.println("Reversed LinkedList");
        list.printLL(head);
    }


}