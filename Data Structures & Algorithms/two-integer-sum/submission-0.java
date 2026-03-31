class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=-1;
        int end=-1;
        for(int i=0;i<nums.length-1;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==target){
                   start=i;
                   end=j;
                   return new int[]{start,end};
                }
                sum=nums[i];
            }
        }
        return new int[]{start,end};
    }
}
