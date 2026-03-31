class Solution {
    public boolean isAnagram(String s, String t) {
        char c[]=s.toCharArray();
        Arrays.sort(c);
        char ch[]=t.toCharArray();
        Arrays.sort(ch);
        String ss=Arrays.toString(c);
        String tt=Arrays.toString(ch);
        return ss.equals(tt);
    }
}
