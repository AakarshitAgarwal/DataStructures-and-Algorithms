package Tree.Binary_Search_Tree;

import org.graalvm.compiler.graph.Node.Successor;

class Node{
    int data;
    Node left;
    Node right;
}


class BST{

    public Node createNewNode(int k){
        Node a=new Node();
        a.data=k;
        a.left=null;
        a.right=null;

        return a;
    }
    public Node insert(Node node, int val){
        if(node==null){
            return createNewNode(val);
        }

        if(val<node.data){
            node.left=insert(node.left, val);
        }else if(val>node.data){
            node.right=insert(node.right, val);
        }

        return node;
    }
    public Node delete(Node node, int val){
        if(node==null){
            return null;
        }

        // Recursive calls for ancestors of
        // node to be deleted

        if(val<node.data){
            node.left=delete(node.left, val);
        }else if(val>node.data){
            node.right=delete(node.right, val);
        }else{
            if(node.left==null || node.right==null)   //checking left and right of the node
            {
                Node temp=null;
                temp=node.left==null?node.right:node.left;  //if node is null than temp left else right

                if(temp==null)   //this will check is nothing is there in ancestor than return null
                {
                    return null;
                }else  //if anything is there in ancestor than return that node value i.e either of the node is there
                {
                    return temp;
                }
            } else  //if both successors are there
            {
                    Node successor=getSuccessor(node);
                    node.data=successor.data;   // 3 will become 4 is delete 6
                    node.right=delete(node.right,successor.data);        //since 4 does not have any child
                    return node;
            }
        }
        return node;
    } 

    public Node getSuccessor(Node node){
        if(node==null){
            return null;
        }

        Node temp=node.right;

        while(temp.left!=null){
            temp=temp.left;  //nice logic!
        }
        return temp;
    }
}

public class BSTApp {
public static void main(String args[]){
    BST a =new BST();
    Node root=null;
    //8, 3, 6, 10, 4, 7, 1, 14, 13


    /*
                8
        3             10
    1       6               14                   
        4       7       13            
    */
    root = a.insert(root, 8);
    root = a.insert(root, 3);
    root = a.insert(root, 6);
    root = a.insert(root, 10);
    root = a.insert(root, 4);
    root = a.insert(root, 7);
    root = a.insert(root, 1);
    root = a.insert(root, 14);
    root = a.insert(root, 13);
    // root = a.insert(root, 3);

    root=a.delete(root, 1);
}    
}
 
