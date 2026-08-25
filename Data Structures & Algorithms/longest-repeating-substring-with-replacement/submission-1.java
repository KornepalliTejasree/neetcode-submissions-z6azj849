class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int len=0;
        int i=0;
        int j=0;
        int maxfreq=Integer.MIN_VALUE;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            maxfreq=Math.max(map.get(s.charAt(j)),maxfreq);
            while((j-i+1)-maxfreq>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                for(Map.Entry<Character,Integer> e:map.entrySet()){
                     maxfreq=Math.max(e.getValue(),maxfreq);
                }
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
