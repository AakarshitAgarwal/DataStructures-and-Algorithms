class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    public static long merge(long arr[],long temp[],int left,int mid,int right){
        
        // long i,j,k;
        long inv_count=0;
        
        int i=left;
        int j=mid;
        int k=0;
        
        while((i<=mid-1) && (j<=right)){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
                
                inv_count=inv_count+(mid-i);
            }
        }
        
        while(i<=mid-1){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(i=left;i<=right;i++){
            arr[i]=temp[i];
        }
        
        return inv_count;
        
    }
    
    public static long mergeSort(long arr[],long temp[],int left,int right){
        int mid;
        long inv_count=0;
        
        if(right>left){
        
        mid=(left+right)/2;
        
        
        inv_count += mergeSort(arr,temp,left,mid);
        inv_count += mergeSort(arr,temp,mid+1,right);
        inv_count += merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }
    static long inversionCount(long arr[],long N)
    {
        // Your Code Here
        // int l=arr.length;

        
        int l=(int)N;
        
        long[] temp=new long[l];
        
        // long ans=0;
        
        long ans=mergeSort(arr,temp,0,l-1);
        return ans;

    }
}