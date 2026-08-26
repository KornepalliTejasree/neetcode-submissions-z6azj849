class Solution {
    public String minWindow(String s, String t) {
        int[] hash=new int[256];
        int i=0;
        int j=0;
        for(char t1:t.toCharArray()){
            hash[t1]++;
        }
        int count=0;
        int startIdx=-1;
        int len=Integer.MAX_VALUE;
        while(j<s.length()){
            char c=s.charAt(j);
            if(hash[c]>0)count++;
            hash[c]--;
            while(count==t.length()){
                char ch=s.charAt(i);
                hash[ch]++;
                if(len>j-i+1){
                    len=j-i+1;
                    startIdx=i;
                }
                if(hash[ch]>0){
                    count--;
                }
                i++;
            }
            j++;
        }
        return startIdx==-1?"":s.substring(startIdx,startIdx+len);
    }
}
