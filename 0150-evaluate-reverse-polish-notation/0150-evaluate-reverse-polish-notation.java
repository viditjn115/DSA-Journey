class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for(String token:tokens){
            if(!isOperator(token)){
                dq.push(Integer.parseInt(token));
            }
            else{
                int num2 = dq.pop();
                int num1 = dq.pop();
                dq.push(calc(num1 , num2 ,token));
            }
        }
        return dq.pop();

    }
    private boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
            return true;
        }
        return false;
    }
    private int calc(int num1 , int num2 , String operator){
        if(operator.equals("+")){
            return num1+num2;
        }
        if(operator.equals("-")){
            return num1-num2;
        }
        if(operator.equals("/")){
            return num1/num2;
        }
        else{
            return num1*num2;
        }
        
    }
}