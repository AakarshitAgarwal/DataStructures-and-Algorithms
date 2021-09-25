class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int len=0;
    	int numberfromfirst=0;
    	int count=0;
    	
    	Node curr=head;
    	    	
    	while(head!=null){
    	    head=head.next;
    	    len=len+1;
    	}
    	numberfromfirst=len-n;
    	

    	while(count!=numberfromfirst && curr!=null){
    	    curr=curr.next;
    	    count++;
    	}

        if(curr!=null){
    	    return curr.data;
    	}else{
    	    return -1;
    	}
    
    
    }
}
