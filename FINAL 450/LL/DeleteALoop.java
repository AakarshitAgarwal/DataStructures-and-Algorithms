class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        HashSet<Node> h=new HashSet<Node>();
        Node prev=null;
        while(head!=null){
            if(h.contains(head)){
              prev.next=null;
              return;
            }
            
            h.add(head);
            prev=head;
            head=head.next;
            
        }
        

        //https://www.youtube.com/watch?v=uU69oIguTN0
        //2nd Solution


    //     Node slow = head;
    //     Node fast = head;
    //     boolean isLoopFound = false;
        
    //     while(slow!=null && fast!=null && fast.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     if(slow == fast){
    //         isLoopFound = true;
    //         break;
    //     }  
    // }
    // if(isLoopFound){
    //     slow=head;
        
    //     if(slow!=fast){
    //         while(slow.next!=fast.next){
    //             slow=slow.next;
    //             fast=fast.next;
    //         }
    //         fast.next=null;
    //     }
    //     else{
    //         while(fast.next!=slow){
    //             fast=fast.next;
    //         }
    //         fast.next=null;
    //     }
    // }
    

        //this conditon will not work for 
        //5
        //7 58 36 34 16
        //1
        
        // while(slow.next!=temp.next){
        //     temp=temp.next;
        //     slow=slow.next;
        // }
        // slow.next=null;

    
    }    
}