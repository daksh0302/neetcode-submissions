class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>() ;
       for(int i = 0;i<s.length();i++){
        char op = s.charAt(i);
        if(op =='('){
            stack.push(op);
            }
            else if(op=='['){
                stack.push(op);
            }
            else if(op=='{'){
                stack.push(op);
            }
            else if(op==')'){
           if (!stack.isEmpty()&&stack.peek()=='('){
           stack.pop();
           }
           else{return false;}
            }
             else if(op==']'){
           if (!stack.isEmpty()&&stack.peek()=='['){
           stack.pop();
           }
           else return false;
            }
             else if(op=='}'){
           if (!stack.isEmpty()&&stack.peek()=='{'){
           stack.pop();
           }
           else{return false;}
            }
       

        }
return stack.isEmpty();
    }
        }

        

            
