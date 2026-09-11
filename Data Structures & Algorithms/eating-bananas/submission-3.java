class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        
        int u= piles[0];
     
        for(int j = 0 ; j<piles.length;j++){
            if(u<piles[j]){
              u =  piles[j] ;
                
     }}
        

     int left = 1;
         int right = u ;
         while(left<=right){
         int mid = left+(right-left)/2;
         int time = 0;
         for(int j = 0; j<piles.length;j++){
         time += (int) Math.ceil((double) piles[j] / mid);
         }
         
          if(time<=h){
            right = mid-1;
         }
         else{
            left = mid+1;
         }
         }
 
  
    
return left;   
    
            }
         
        
            }
               
    

     

