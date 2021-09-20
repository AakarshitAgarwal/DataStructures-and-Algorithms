class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    // LinkedList<Node> l=new LinkedList<Node>();
    
    
    static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        
        Node prev=null;
        Node curr=head;
        Node next=null;
        
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static Node newNode(int data)
    {
    Node new_node = new Node(data);
    new_node.data = data;
    new_node.next = null;
    return new_node;
    }
    
    static Node addTwoLists(Node first, Node second){
        
        if(first==null || second==null){
            return first!=null ? first : second;
        }
        
        
        Node f=reverse(first);
        Node s=reverse(second);
        
        Node head=newNode(-1);
        Node itr=head;
        
        int carry=0;
        
        while(f!=null || s!=null || carry!=0){
            
            int sum=carry+(f!=null?f.data:0)+(s!=null?s.data:0);
            
            
            int ld=sum%10;
            carry=sum/10;
            
            itr.next=newNode(ld);
            itr=itr.next;
            
            if(f!=null){
                f=f.next;
            }
            if(s!=null){
                s=s.next;
            }
            
        }
        return reverse(head.next);
    }
}