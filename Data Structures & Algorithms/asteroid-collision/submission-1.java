class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer> s = new Stack<>();
     for(int i = 0;i<asteroids.length;i++){
        while(!s.isEmpty()&&s.peek()>0&& asteroids[i]<0){
            if(Math.abs(s.peek()) < Math.abs(asteroids[i])){
                s.pop();
                
            }
            else if(Math.abs(s.peek()) == Math.abs(asteroids[i])){
           s.pop();
           asteroids[i] = 0 ;
           break;
            }
else{
    asteroids[i] = 0;
}
        }
          if(asteroids[i]!=0){
            s.push(asteroids[i]);
        }}
        int result [] = new int[s.size()];
        for(int a = s.size()-1; a >= 0; a--){
            result[a] = s.pop();
        }
    
        return result;
        
     }  } 
    
