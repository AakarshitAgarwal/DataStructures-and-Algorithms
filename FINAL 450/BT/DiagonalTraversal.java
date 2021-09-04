class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> ans=new ArrayList<Integer>();
           LinkedList<Node> que=new LinkedList<>();
           
           que.addLast(root);
           while(que.size()!=0){
               
               int size=que.size();
               while(size-->0){
                   Node rn=que.removeFirst();
                   
                   while(rn!=null){
                       ans.add(rn.data);
                       if(rn.left!=null){
                           que.add(rn.left);
                       }
                       rn=rn.right;
                   }
               }
           }
           return ans;
      }
}
