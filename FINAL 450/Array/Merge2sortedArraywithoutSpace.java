class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i=0,j=0;
        while(i<n){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                int temp=arr2[j];
                arr2[j]=arr1[i];
                arr1[i]=temp;
                i++;
            }
            // Arrays.sort(arr2);
            int first=arr2[0];
            int k;
            for(k=1;k<m && arr2[k]<first;k++){
                arr2[k-1]=arr2[k];
            }
            arr2[k-1]=first;
        }
    }
}