class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int k = 0;
        int p = numbers.length-1;
        int[] sum = new int[2];
        while(k<p){
            if((numbers[k]+numbers[p])>target){
                p--;
            }
            if((numbers[k]+numbers[p])<target){
                k++;
            }
            if((numbers[k]+numbers[p])==target){
                sum[0] = k + 1;
sum[1] = p + 1;
return sum;
            }
        }
        return sum;
    }
}
