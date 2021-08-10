package Tree.Binary_Search_Tree;

import java.util.*;

public class BinarySearchTree {
    public static void main(String[] args) {
        // TODO code application logic here
        int n,val;
        Scanner sc=new Scanner(System.in);
        UF_BST bst=new UF_BST();
        do
        {
            System.out.println("\nPress 1 - Add a New Node");
            System.out.println("Press 2 - View Traversals");
            System.out.println("Press 3 - Exit");
            
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter the number to be inserted ");
                    val=sc.nextInt();
                    bst.insert(val);
                    break;
                case 2:
                    System.out.println("Following are the traversals ");
                    bst.traverse();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        }while(n!=3);
    }
    
}
