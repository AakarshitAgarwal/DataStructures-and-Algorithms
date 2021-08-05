// import java.util.*;
// public class Fibonacci
// {
//    public static void main(String args[])
//    {
//       int a=0,b=1,i=0;
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       System.out.println("Number of terms are "+n);
//       System.out.print(a +" ");
//       while (i <= n)
//         {
//             int sum = a + b;
//             a = b;
//             b = sum;
//             i++;
//             System.out.print(sum +"  ");
//         }
//     }
// }

//using recursion
import java.util.*;

public class Fibonacci{
    static int fib(int n){
        if(n<=1)
        return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        int n=9;
        System.out.println(fib(n));
    }
}