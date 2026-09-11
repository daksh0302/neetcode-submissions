class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
   
    
    for(int i=0;i < nums.length-2;i++){
        int k = i+1;
        int j = nums.length-1;
        if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
        while(k<j){
            if(nums[k]+nums[j]+nums[i]<0){
                k++;
            }
           else if(nums[k]+nums[j]+nums[i]>0){
                j--;
            }
            else{
                ans.add(Arrays.asList(nums[i], nums[k], nums[j]));
                k++;
                j--;
                while (k < j && nums[k] == nums[k - 1]) {
    k++;}
    while (k < j && nums[j] == nums[j + 1]) {
    j--;
            
                } }}}
        return ans;
    }
    }

