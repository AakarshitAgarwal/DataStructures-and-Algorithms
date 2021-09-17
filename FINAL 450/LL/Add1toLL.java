class Solution
{
    public static Node reverse(Node head){
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
        
        
    public static Node addOne(Node head) 
    { 
        //code here.
        head=reverse(head);
        
        
        //code
        Node res=head;
        Node temp=null;
        Node prev=null;
        
        int carry=1,sum;
        
        
        while(head!=null){
        sum=carry+head.data;
        
        carry=(sum>=10)?1:0;
        
        
        sum=sum%10;
        
        head.data=sum;
        
        temp=head;
        head=head.next;
        }
        if(carry>0){
            temp.next=newNode(carry);
        }
        
        return reverse(res);
        
    }
}