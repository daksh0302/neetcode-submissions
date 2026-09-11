class Solution {
    
public void merge(int[]nums,int left,int right,int mid){
     int n1 = mid-left+1;
        int n2 = right-mid;
        int arr1[]= new int[n1];
        int arr2[]= new int[n2];
        for(int i =0 ; i<n1;i++){
            arr1[i] = nums[left+i];
        }
        for(int i = 0;i<n2;i++){
            arr2[i] = nums[mid+1+i];
        }
        int l = 0;
        int m = 0;
        int k = left;
        while(l<n1&& m<n2){
            if(arr1[l]<=arr2[m]){
                nums[k] = arr1[l];
                l++;
                k++;

            }
            else{
                nums[k] = arr2[m];
                m++;
                k++;
            }
        }
        while(l < n1) {
    nums[k] = arr1[l];
    l++;
    k++;
}

while(m < n2) {
    nums[k] = arr2[m];
    m++;
    k++;
}
}
    public void mergesort(int[]nums,int left,int right ){
       
        if(left<right){
            int mid = left+(right-left)/2;
            mergesort(nums,left,mid);
            mergesort(nums,mid+1,right);
            merge(nums,left,right,mid);
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        
        return nums;
        
    }
}