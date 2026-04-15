class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
         Stack<Character> q = new Stack();

         for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)=='{' || s.charAt(i) == '[' ||s.charAt(i) == '('){
                q.push(s.charAt(i));
            }
            else if(!q.isEmpty()){
                if(s.charAt(i)=='}' && q.peek()=='{'){
                    q.pop();
                }
                else if(s.charAt(i)==']' && q.peek()=='['){
                    q.pop();
                }
                 else if(s.charAt(i)==')' && q.peek()=='('){
                    q.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }

         }
         return q.isEmpty();
    }
}
