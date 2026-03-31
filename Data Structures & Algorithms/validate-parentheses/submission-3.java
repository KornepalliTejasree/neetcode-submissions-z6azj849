class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char c[]=s.toCharArray();
        for(char i:c){
            if(i=='(' || i=='{' || i=='['){
                st.push(i);
            }
            else{
                if(st.isEmpty())return false;
                char j=st.peek();
                if((j=='('&& i==')') || (j=='{'&& i=='}') || (j=='['&& i==']')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
