class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        for(int i=0;i<s2.length();i++){
            if(i+k<=s2.length()){
                String sub=s2.substring(i,i+k);
                if(check(sub,s1)){
                    return true;
                }
            }
        }
    return false;
    }
    public boolean check(String s1,String s2){
       char c[]=s1.toCharArray();
       char ch[]=s2.toCharArray();
       Arrays.sort(c);
       Arrays.sort(ch);
        return Arrays.equals(c,ch);
    }
}
