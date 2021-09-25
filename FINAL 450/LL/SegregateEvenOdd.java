class Solution{
    Node divide(int N, Node head){
        // code here
        if(head==null || head.next==null){
            return head;
        }
        
        Node dummyeven=new Node(-1);
        // Node even=dummyeven;
        Node ep=dummyeven;
        
        Node dummyodd=new Node(-1);
        // Node odd=dummyodd;
        Node op=dummyodd;
        
        Node curr=head;
        
        while(curr!=null){
            if((curr.data)%2==0){
                ep.next=curr;
                curr=curr.next;
                ep=ep.next;
            }
            else{
                op.next=curr;
                curr=curr.next;
                op=op.next;
            }
        }
        
        ep.next=dummyodd.next;
        op.next=null;
        
        return dummyeven.next;
        
    }
}