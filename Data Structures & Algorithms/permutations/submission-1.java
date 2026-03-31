class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        list=new ArrayList<>();
        per(nums,0);
        return list;
    }
    public void per(int arr[],int fi){
        if(fi==arr.length){
            List<Integer> l = new ArrayList<>();
                for (int i : arr) {
                     l.add(i);
                    }
            list.add(l);
            return;
        }
        for(int i=fi;i<arr.length;i++){
            swap(arr,i,fi);
            per(arr,fi+1);
            swap(arr,i,fi);
        }
    }
    public void swap(int arr[],int i,int fi){
        int temp=arr[i];
        arr[i]=arr[fi];
        arr[fi]=temp;
    }
}
