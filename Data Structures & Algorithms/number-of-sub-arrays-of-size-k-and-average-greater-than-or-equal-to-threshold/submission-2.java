class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
     int left = 0;
     int right = k-1;
     int count = 0;
     int sum = 0;
     for(int i = left; i <=right;i++) {
        sum += arr[i];
     }
     while(right<arr.length){
        if(sum>=threshold*k){
            count++;
        }
            sum-=arr[left++];
            right++;
            if(right<arr.length){
                sum +=arr[right];
            }

        }
      
     
     return count;
    }
}