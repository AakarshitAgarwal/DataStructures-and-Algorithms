class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        
        ArrayList<Integer> ans=new ArrayList<>();
        LinkedList<Node> que=new LinkedList<>();
        
        if(node==null){
            return ans;
        }
        
        que.addLast(node);
        while(que.size()!=0){
            int size=que.size();
            ans.add(que.getFirst().data);
            while(size-->0){
                Node rn=que.removeFirst();
                if(rn.right!=null) que.addLast(rn.right);
                if(rn.left!=null) que.addLast(rn.left);
                }
        }
        return ans;
        
        
    }
}