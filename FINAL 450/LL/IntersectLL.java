class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node head=null,tail=null;
        
        while(head1!=null && head2!=null){
            
        if(head1.data==head2.data)
        {
            if(head==null){
                tail=head=new Node(head1.data);
            }
            else{
                tail=tail.next=new Node(head1.data);
            }
            // res.next=head1; 
            head1=head1.next;
            head2=head2.next;
        }
        else if(head1.data<head2.data){
            head1=head1.next;
        }
        else{
            head2=head2.next;
        }
    }
            return head;
    }        
}