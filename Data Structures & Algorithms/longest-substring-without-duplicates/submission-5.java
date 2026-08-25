class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[256];
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            freq[ch]++;
            while(freq[ch]>1){
                char c=s.charAt(i);
                freq[c]--;
                i++;
            }
        max=Math.max(j-i+1,max);
        j++;
        }
        return max;
    }
}
