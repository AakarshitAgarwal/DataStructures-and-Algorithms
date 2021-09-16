class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        
        HashSet<Node> s=new HashSet<Node>();
        while(head!=null){
            if(s.contains(head)){
                return true;
            }
            
            s.add(head);
            
            head=head.next;
        }
        return false;
    }
}