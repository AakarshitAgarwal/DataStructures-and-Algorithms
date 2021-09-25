class Solution
{
    
    static Node reverse(Node head){
        Node curr=head;
        Node pre=null;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    
    Node compute(Node head)
    {
        
        head=reverse(head);
        
        Node curr1=head; //for returning
        int ma=head.data;
        Node pre1=head;
        head=head.next;
        
        while(head!=null){
            if(head.data>=ma){
                ma=head.data;
                pre1=head;
                head=head.next;
            }
            else{
                pre1.next=head.next;
                head=pre1.next;
            }
        }
        
        head=reverse(curr1);
        
        return head;
        
        
    }
}