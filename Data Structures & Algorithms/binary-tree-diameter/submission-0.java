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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        diameter(root);
        int max=Integer.MIN_VALUE;
        for(int i:list){
            max=Math.max(max,i);
        }
        return max;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void diameter(TreeNode root){
        if(root==null)return;
        int a=height(root.left);
        int b=height(root.right);
        int sum=a+b;
        list.add(sum);
        diameter(root.left);
        diameter(root.right);
    }
}
