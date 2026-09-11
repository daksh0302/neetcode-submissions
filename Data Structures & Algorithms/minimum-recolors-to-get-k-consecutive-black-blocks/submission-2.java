class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = k;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while(right<=blocks.length()){
            count = 0;
            for(int i = left; i <right;i++){
                if(blocks.charAt(i)=='W'){
                    count++;
                }
            }
             min = Math.min(min,count);
            left++;
            right++;
           
        }
        return min;
    }
}