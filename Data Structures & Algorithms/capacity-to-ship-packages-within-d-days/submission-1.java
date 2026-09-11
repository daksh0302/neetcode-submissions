class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int left = 0;
    int right = 0;
    
    
    for(int i = 0; i<weights.length;i++){
        right+=weights[i];
        left = Math.max(left,weights[i]);
        
    }
    while(left<right){
        int mid = left+(right-right)/2;
        int currentweight = 0;
        int totaldays = 1;
    for(int weight :weights){
      
       
        if(currentweight+weight>mid){
            currentweight = 0;
            totaldays++;
        }
        currentweight += weight;
        
        }
        if(totaldays<=days){
            right = mid;
        }
        else{
            left = mid+1;
        }

        }
        return left;
        
    }
    
    }
