class Solution {
    public int nlongestOnes(int[] nums, int k) {
         int left = 0;
        int maxsum = 0;
        int zero = 0;
        int n = nums.length;
        for(int right = 0; right<n;right++){
            if(nums[right]==0){
            zero++;
            }
            while(left<=right&&zero>k){
                if(nums[left]==0){
zero--;

                }
                left++;
                
            }
            maxsum = Math.max(maxsum,right-left+1);
        }
        return maxsum;
        
    }
    public int longestOnes(int[] nums, int k) {
        return nlongestOnes(nums,k);
    }
}