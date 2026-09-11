class Solution {
    public int maxnumSubarraysWithSum(int[] nums, int goal) {
       int left = 0;
       int count = 0;
       int sum = 0;
       int n = nums.length;
       for(int right=0;right<n;right++) {
sum += nums[right];
while(left<=right && sum>goal){
    sum-=nums[left];
    left++;
}
count += right-left+1;


       }
       return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       return maxnumSubarraysWithSum( nums, goal)-maxnumSubarraysWithSum(nums, goal-1);
        
    }
}