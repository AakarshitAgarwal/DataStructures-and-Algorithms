import java.util.*;


public class Palindrome{
    public static void main(String args[]){
    String str= "Aakarshit";

    char[] ch=str.toCharArray();
    boolean flag=true;

    for(int i=0,j=(str.length()-1);i<j;i++,j--){
        if(ch[i]!=ch[j]){
            flag=false;
            break;
            //System.out.println("String is palindrome");
        }
    }
    if(flag){
        System.out.println("String is palindrome");
    }
    else{
        System.out.println("String is not palindrome");
    }

    }

}