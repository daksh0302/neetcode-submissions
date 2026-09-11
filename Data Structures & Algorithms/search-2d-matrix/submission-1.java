class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] flat = new int[matrix.length*matrix[0].length];
        int k = 0;
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j< matrix[i].length;j++){
         flat[k] = matrix[i][j];
         k++;
            }
        }
        
            int left = 0;
            int right = flat.length-1;
           
            while(left<=right){
                 int mid = left + (right-left)/2;
                if(flat[mid]==target){
                    return true;
                }
                else if(flat[mid]>target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        return false;
        }
    }

