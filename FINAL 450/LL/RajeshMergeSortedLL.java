class Solution
{
    //Function to sort the given linked list using Merge Sort.
    
    static Node mid(Node node){
        if(node==null || node.next==null){
            return node;
        }
        Node f=node;
        Node s=node;
        
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    
    public static Node mergeTwoSortedList(Node l1,Node l2){
        if(l1==null || l2==null){
            return l1!=null?l1:l2;
        }
        Node one=l1;
        Node two=l2;
        
        // LinkedList res=new LinkedList();
        Node dummy=new Node(-1);
        Node prev=dummy;
        
        while(one!=null && two!=null){
            if(one.data<two.data){
                // res.addLast(one.data);
                prev.next=one;
                one=one.next;
            }
            else{
                // res.addLast(two.data);
                prev.next=two;
                two=two.next;
            }
        }
        
        while(one!=null){
            // res.addLast(one.data);
            prev.next=one;
            one=one.next;
        }
        
        while(two!=null){
            // res.addLast(two.data);
            prev.next=two;
            two=two.next;
        }
        return dummy;
    }
    
    static Node mergeSort(Node head)
    {
        // add your code here
        // Node tail=head;
        // while(tail.next!=null){
        //     tail=tail.next;
        // }
        // if(head==tail){
        //     LinkedList br=new LinkedList();
        //     br.addLast(head.data);
        //     return br;
        // }
        
        if(head==null || head.next==null){
            return head;
        }
        
        
        Node midn=mid(head);
        Node nHead=midn.next;
        midn.next=null;  //breaking two linklist
        
        Node fsh=mergeSort(head);
        Node ssh=mergeSort(nHead);
        Node c1=mergeTwoSortedList(fsh,ssh);
        
        return c1;
        
    }
}