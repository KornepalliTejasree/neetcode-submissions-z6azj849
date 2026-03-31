class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums1){
            list.add(i);
        }
        for(int i:nums2){
            list.add(i);
        }
        Collections.sort(list);
        double result=0.f;
        if(list.size()%2==0){
            result=(list.get((list.size()/2)-1)+list.get(list.size()/2))/2.0f;
        }
        else{
            result=list.get(list.size()/2);
        }
        return result;
    }
}
