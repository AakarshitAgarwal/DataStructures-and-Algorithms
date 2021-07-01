import java.util.*;

public class Runner {
    public static void main(String args[]){

        DStack nums=new DStack();
        nums.push(15);
        nums.show();

        nums.push(10);
        nums.show();

        nums.push(8);
        nums.show();

        nums.push(11);
        nums.show();

        nums.push(11);
        nums.show();




        System.out.println(nums.pop());
        System.out.println(nums.pop()); 

        System.out.println(nums.pop());
        nums.show();
        // System.out.println(nums.size());

        // System.out.println(nums.pop());
        
        // System.out.println(nums.pop());
        System.out.println(nums.pop());
        nums.show();

    }
    
}
