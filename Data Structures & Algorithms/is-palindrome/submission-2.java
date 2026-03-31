class Solution {
    public boolean isPalindrome(String s) {
        s=s.replace(" ","").toLowerCase();
        String ss="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                ss+=s.charAt(i);
            }
        }
        int start=0;
        int end=ss.length()-1;
        boolean pal=true;
        while(start<=end){
            if(ss.charAt(start)!=ss.charAt(end)){
                pal=false;
            }
            start++;
            end--;
        }
        return pal;
    }
}
