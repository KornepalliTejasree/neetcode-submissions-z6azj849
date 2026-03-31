class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String i:tokens){
       
        
        if(i.equals("*") || i.equals("-") || i.equals("+") || i.equals("/")  ){
           
            int a=stack.pop();
            int b=stack.pop();
            int result=0;
            if(i.equals("*")){
                result=a*b;
            }
            else if(i.equals("+")){
                result=a+b;
            }
            else if(i.equals("-")){
                result=b-a;
            }
            else{
                result=b/a;
            }
            stack.push(result);
            }
        
        else{
            int number=Integer.parseInt(i);
            stack.push(number);
        }
        }
        return stack.pop();
    }
}
