class Solution {
    public boolean isPalindrome(String s) {
    int k = 0;
    int p = s.length()-1;
    while(k<p){
    if(!Character.isLetterOrDigit(s.charAt(k))){
      k++;
      continue;
    }
    if(!Character.isLetterOrDigit(s.charAt(p))){
      p--;
      continue;
    }  if (Character.toLowerCase(s.charAt(k)) != Character.toLowerCase(s.charAt(p))){return false;} 
    k++;
    p--;
    }
    return true;}}