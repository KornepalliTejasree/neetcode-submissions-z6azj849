/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        list=new ArrayList<>();
        change(root,k);
        Collections.sort(list);
        return list.get(k-1);
    }
    public void change(TreeNode root,int k){
        if(root==null) return;
        list.add(root.val);
        change(root.left,k);
        change(root.right,k);
    }
}
