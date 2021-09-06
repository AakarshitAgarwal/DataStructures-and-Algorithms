class Solution{
   
   
    Map<String,Integer> map;
    List<Node> list;
    List<String> res;
    List<String> temp;    
    public List<Node> printAllDups(Node root)
    {
       //code here
        map=new HashMap<>();
        list=new ArrayList<>();
        res=new ArrayList<>();
        temp=new ArrayList<>();

        duplicates(root);

        return list;
       
    }
    
    String duplicates(Node node){
    if(node==null){
        return "X";
    }
    String l=duplicates(node.left);
    String r=duplicates(node.right);
    String s=Integer.toString(node.data)+"-"+l+"-"+r;
    map.put(s,map.getOrDefault(s,0)+1);
    if(map.get(s)==2 ){
        list.add(node);
    }
    return s;
    }
    
}