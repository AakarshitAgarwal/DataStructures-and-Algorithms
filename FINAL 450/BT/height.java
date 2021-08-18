class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
    if(node==null){
        return 0;  //in term of node 
    }
    
    int lh=height(node.left);
    int rh=height(node.right);
    int th=Math.max(lh,rh)+1;
    
    return th;
    }
}