class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {        
        HashSet<Integer> hs=new HashSet<Integer>();
        
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            int currvalue=curr.data;
            
            
            if(hs.contains(currvalue)){
                prev.next=curr.next;
            }
            else{
                hs.add(currvalue);
                prev=curr;
            }
                curr=curr.next;
                
            }
            return head;
        }
    }