class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> r = new Stack<>();

        for(String s : t){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")  ){
                r.push(Integer.parseInt(s));
            }
            else{
                int a = r.pop();
                int b = r.pop();

                switch(s){
                    case"+":{r.push(a+b);break;}
                    case"-":{r.push(b-a);break;}
                    case"*":{r.push(a*b);break;}
                    case"/":{r.push(b/a);break;}
                }
                
            }
        }
        return r.pop();
    }
}
