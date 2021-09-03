class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    
    public static void width(Node node,int h1,int[] minMax){
        if(node==null) return;
        
        minMax[0]=Math.min(minMax[0],h1);
        minMax[1]=Math.max(minMax[1],h1);
        
        width(node.left,h1-1,minMax);
        width(node.right,h1+1,minMax);
    }
    
    public static class vPair{
        Node node=null;
        int h1=0;
        
        vPair(Node node,int h1){
            this.node=node;
            this.h1=h1;
        }
    }
    
    
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
          
        int[] minMax=new int[2];
        width(root,0,minMax);
        int len=minMax[1]-minMax[0]+1;
        
        for(int i=0;i<len;i++){
            ans.add(null);
        }
        
        LinkedList <vPair> que=new LinkedList<>();
        que.addLast(new vPair(root,Math.abs(minMax[0])));
        while(que.size()!=0){
            int size=que.size();
            while(size-->0){
                vPair rp=que.removeFirst();
                Node node=rp.node;
                int h1=rp.h1;
                // if(ans.get(h1)==null){
                //     ans.set(h1,node.data);
                // }
                ans.set(h1,node.data);
                if(node.left!=null){
                    que.addLast(new vPair(node.left,h1-1));
                }
                if(node.right!=null){
                    que.addLast(new vPair(node.right,h1+1));
                }
            }
        }
        
        
        return ans;
        
        
    }
}