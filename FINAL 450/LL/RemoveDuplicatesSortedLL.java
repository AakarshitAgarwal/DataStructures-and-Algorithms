class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	
	Node curr=head;
	
	if(head==null){
	    return null;
	}
	
	while(curr!=null && curr.next!=null){
	    if(curr.data == curr.next.data){
	        curr.next=curr.next.next;
	    }
	    else{
	   curr=curr.next;
	    }
	}
    return head;
    }
}