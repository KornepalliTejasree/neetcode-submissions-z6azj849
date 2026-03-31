class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=Integer.MIN_VALUE;
        while(left<right){
            int min=Math.min(height[left],height[right]);
             maxWater=Math.max(maxWater,min*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}