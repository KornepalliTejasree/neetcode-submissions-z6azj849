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
    StringBuilder st=new StringBuilder();
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     st=new StringBuilder();
     inorder(root);
     String s=st.toString();

     st=new StringBuilder();
     inorder(subRoot);
     String str=st.toString();
     return s.contains(str);
    }
    public void inorder(TreeNode root){
        if(root==null){
            st.append('*');
            return;
        }
        st.append(root.val);
        inorder(root.left);
        inorder(root.right);
    }
}
