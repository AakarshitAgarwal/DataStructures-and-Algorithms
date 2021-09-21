class Solution
{
    //Function to sort the given linked list using Merge Sort.
    
    static Node mid(Node head,Node tail){
        Node f=head;
        Node s=head;
        
        while(f!=tail && f.next!=tail){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    
    public static LinkedList mergeTwoSortedList(LinkedList l1,LinkedList l2){
        Node one=l1.head;
        Node two=l2.head;
        
        LinkedList res=new LinkedList();
        while(one!=null && two!=null){
            if(one.data<two.data){
                res.addLast(one.data);
                one=one.next;
            }
            else{
                res.addLast(two.data);
                two=two.next;
            }
        }
        
        while(one!=null){
            res.addLast(one.data);
            one=one.next;
        }
        
        while(two!=null){
            res.addLast(two.data);
            two=two.next;
        }
        return res;
    }
    
    static Node mergeSort(Node head)
    {
        // add your code here
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        if(head==tail){
            LinkedList br=new LinkedList();
            br.addLast(head.data);
            return br;
        }
        
        Node midn=mid(head,tail);
        LinkedList fsh=mergeSort(head);
        LinkedList ssh=mergeSort(mid.next);
        LinkedList c1=LinkedList.mergeTwoSortedList(fsh,ssh);
        
        return c1;
        
    }
}