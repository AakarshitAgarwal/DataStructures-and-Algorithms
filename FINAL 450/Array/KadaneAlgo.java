class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        long maxsofar=arr[0];
        long cursum=0;
        
        for(int i=0;i<arr.length;i++){
            cursum=cursum+arr[i];
            if(cursum>maxsofar){
                maxsofar=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsofar;
        
        // long csum=arr[0];
        // long osum=arr[0];
        
        // for(int i=1;i<arr.length;i++){
        //     if(csum>=0){
        //         csum+=arr[i];
        //     }else{
        //         csum=arr[i];
        //     }
        //     if(csum>osum){
        //         osum=csum;
        //     }
        // }
        
        // return osum;
    }
    
}