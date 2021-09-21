public class IntersectionofYLL {
    
}
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
    
    static int getcount(Node node){
        Node current=node;
        int count=0;
        
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    
	int intersectPoint(Node head1, Node head2)
	{
         // code here
        Node current1=head1;
        Node current2=head2;
        
        int c1=getcount(head1);
        int c2=getcount(head2);
        int d=0;
        int r=0;
        
  
        if(c1>c2){
            d=c1-c2;
            for(int i=0;i<d;i++){
                current1=current1.next;
            }
        }
        else if(c2>c1){
            d=c2-c1;
            for(int i=0;i<d;i++){
                current2=current2.next;
            }
        }

        while(current1!=null && current2!=null){
            if(current1.data==current2.data){
            return current1.data;
        }
            current1=current1.next;
            current2=current2.next;
        }
        return r;
	}
}