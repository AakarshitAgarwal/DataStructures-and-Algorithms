class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        // Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            if(q.size()>k){
            q.poll();
        }
        }
        int s=q.peek();
        return s;
        
    } 
}