class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        if(node == null){
            return null;
        }
        
        Stack<Node> s=new Stack<Node>();
        Queue<Node> q=new ArrayDeque<Node>();
        
        q.add(node);
        while(!q.isEmpty()){
            node=q.poll();
             if(node.right!=null){
                 q.offer(node.right);
             }
             if(node.left!=null){
                 q.offer(node.left);
             }
             s.push(node);
        }
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(!s.isEmpty()){
            l.add(s.pop().data);
            // return(s.pop().data);
        }
        return l;
    }
}     