class Solution{
    static int minJumps(int[] arr){
        // your code here
        int currReach=0;
        int curMax=0;
        int jumps=0;
        
        for(int i=0;i<arr.length-1;i++){
            if(i+arr[i]>curMax){
                curMax=i+arr[i];
            }
            if(i==currReach){
                currReach=curMax;
                jumps++;
            }
        }
        if(currReach>=arr.length-1){
            return jumps;    
        }
        else{
            return -1;
        }
        // return jumps;
        
    }
}