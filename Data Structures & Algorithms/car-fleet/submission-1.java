class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> s = new Stack<>();
    int cars[][] = new int[position.length][2];
        for(int i = 0; i <position.length;i++ ){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        
        
        }
        Arrays.sort(cars,(a,b)->b[0]-a[0]);
        for(int i = 0;i<cars.length;i++){
             double time = (double) (target - cars[i][0])/cars[i][1];
            while(!s.isEmpty()&&time>s.peek()){
                s.push(time);
            }
            if(s.isEmpty()){
                s.push(time);
            }
            }
            
        
        return s.size();
    }
}
        
    