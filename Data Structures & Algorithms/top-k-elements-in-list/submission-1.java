class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
        Collections.sort(l,(a,b)-> b.getValue()-a.getValue());
        int num[]=new int[k];
        int j=0;
       for(Map.Entry<Integer,Integer> i:l){
        num[j++]=i.getKey();
        if(j==k){
            break;
        }
       }
    return num;
    }
}
