class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        boolean visited[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;
            List<String> l=new ArrayList<>();
            l.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(visited[j]==false){
                if(isAnagram(strs[i],strs[j])){
                    l.add(strs[j]);
                    visited[j]=true;
                }
                }
            }
            list.add(new ArrayList<String>(l));
           // Collections.sort(list);
        
        }
        return list;
    }
    public boolean isAnagram(String s1,String s2){
        char c[]=s1.toCharArray();
        char ch[]=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        String s1s=Arrays.toString(c);
        String s2s=Arrays.toString(ch);
        return s1s.equals(s2s);
    }
}
