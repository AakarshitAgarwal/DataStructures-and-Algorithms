// Java implementation of simple method to find count of
// pairs with given sum.
import java.io.*;
import java.lang.*;
import java.util.*;
class CountPairSum {
	public static void main(String args[])
	{
		// int[] arr = { 1, 5, 7, -1, 5 };
        int[] arr={3,3,3,3};
		int k = 6;
        int n=arr.length;
		System.out.println(getPairsCount(arr,n, k));
	}

	// Prints number of pairs in arr[0..n-1] with sum equal
	// to 'sum'
	static int getPairsCount(int[] arr,int n, int k)
	{
        
        int[][] dp=new int[n+1][k+1];
        
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<k+1;j++){
        //         if(i==0){
        //             dp[i][j]=0;
        //         }
        //         if(j==0){
        //             dp[i][j]=1;
        //         }
        //     }
        // }
        dp[0][0]=1;

        for(int i = 1; i <= k; i++)
        dp[0][i] = 0;
  
        for(int i = 1; i <= n; i++)
        dp[i][0] = 1;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][k];
	}
}
// This program is contributed by Jyotsna
