class Solution {
    public int mnumSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int prod = 1;
        int count = 0;
        int n = nums.length;
        for(int right=0;right<n;right++){
            prod *= nums[right];
        
        while(left<=right&&prod>=k){
            prod /=nums[left];
            left++;
        }
        count += right-left+1;
    }
    return count ;
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return mnumSubarrayProductLessThanK( nums, k);
    }
}