class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int k=0;
        int j=heights.length-1;
        while(k<j){
int width = j - k;
int height = Math.min(heights[k],heights[j]);
int area = height*width;
maxArea = Math.max(maxArea,area);
        
        if(heights[k]<heights[j]){
            k++;
        }
        else{j--;}
        }
        return maxArea;
        }}
