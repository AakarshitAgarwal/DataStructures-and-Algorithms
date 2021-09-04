class Solution {

    Map<String,Integer> map;
    List<String> list;
    List<String> res;
    List dupSub(Node root) {
        // code here 
        map=new HashMap<>();
        list=new ArrayList<>();
        res=new ArrayList<>();
        duplicates(root);
        for(String i : list){
            if(i.length()>5){
                res.add(i);
            }
        }
        return res;
        //return list;
    }

    
    String duplicates(Node node){
        if(node==null){
            return "X";
        }
        String l=duplicates(node.left);
        String r=duplicates(node.right);
        String s=Integer.toString(node.data)+"-"+l+"-"+r;
        map.put(s,map.getOrDefault(s,0)+1);
        if(s.length()>5 && map.get(s)==2 ){
            list.add(s);
        }
        return s;
    }
    

}