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
    public boolean isValidBST(TreeNode root) {
        list=new ArrayList<>();
        inorder(root);
        ArrayList<Integer> l=new ArrayList<>(list);
        Collections.sort(l);
        if(NotDuplicates(list)){
            return l.equals(list);
        }
        return false;
    }
    public void inorder(TreeNode root){
        if(root==null) {
            
            return;
            }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public boolean NotDuplicates(ArrayList<Integer> list){
        HashSet<Integer> set=new HashSet<>(list);
        return set.size()==list.size();
    }
}
