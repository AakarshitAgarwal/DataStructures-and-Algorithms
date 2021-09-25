public class GfG
{
    static Node mergerTwoLL(Node a,Node b){
        
        Node temp=new Node(-1);
        Node res=temp;
        
        while(a!=null && b!=null){
            if(a.data<b.data){
                res.bottom=a;
                a=a.bottom;
            }
            else{
                res.bottom=b;
                b=b.bottom;
            }
            res=res.bottom;
        }
        
        if(a!=null){
            res.bottom=a;
        }else{
            res.bottom=b;
        }
        
        return temp.bottom;
    }
    
    Node flatten(Node root)
    {
	// Your code here
	if(root==null || root.next==null){
	    return root;
	}
	
	root.next=flatten(root.next);
	root=mergerTwoLL(root,root.next);
	
	return root;
	
    }
}
