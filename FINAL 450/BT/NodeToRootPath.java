class GfG {
    
    public static ArrayList<Node> NodeToRootPath(Node node,int number){
        
        
        if(node == null){
            return null;
        }
        
        if(node.data == number){
            ArrayList<Node> path=new ArrayList<>();
            path.add(node);
            return path;
        }
        
        ArrayList<Node> left = NodeToRootPath(node.left,number);
        if(left!=null){
            left.add(node);
            return left;
        }
         
        ArrayList<Node> right = NodeToRootPath(node.right,number); 
        if(right!=null){
            right.add(node);
            return right;
        }
        
        return null;
        
    } 
        
    public static int findDist(Node root, int a, int b) {
        // Your code here
        
        ArrayList<Node> p1 = NodeToRootPath(root,a);
        ArrayList<Node> p2 = NodeToRootPath(root,b);
        
        
        
        int i=p1.size()-1;
        int j=p2.size()-1;
        
        while(i>=0 && j>=0 && p1.get(i)==p2.get(j)){
            i--;
            j--;
        }
        
        i++;
        j++;
        
        return i+j;
    }
}