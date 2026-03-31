class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=1;
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        int maxCount=1;
        for(int i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)+1){
            count++;
           }
           else{
            maxCount=Math.max(maxCount,count);
            count=1;
           }
        }
        return Math.max(maxCount,count);
    }
}
