class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> mq=new ArrayDeque<Node>();
        Queue<Node> st=new ArrayDeque<Node>();
        // Stack<Node> st=new Stack<Node>();
        mq.add(node);
        
        while(mq.size()>0){
            int count=mq.size();
            for(int i=0;i<count;i++){
                node=mq.remove();
                st.add(node);
                
                if(node.left!=null){
                    mq.add(node.left);
                }
                if(node.right!=null){
                    mq.add(node.right);
                }
            }
        }
        
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(!st.isEmpty()){
            l.add(st.poll().data);
            // return(s.pop().data);
        }
        return l;
    }
}