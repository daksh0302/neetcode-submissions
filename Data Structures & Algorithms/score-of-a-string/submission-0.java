class Solution {
    int score = 0;
    
    public int scoreOfString(String s)
     {
       
        for(int i=1;i<s.length();i++){
           score += Math.abs(s.charAt(i)-s.charAt(i-1));
            
        }
        return score;
        
    }
}