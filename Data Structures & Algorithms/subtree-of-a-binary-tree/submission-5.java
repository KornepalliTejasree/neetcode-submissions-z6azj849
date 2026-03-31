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
        sub(root);
        String s=st.toString();
        st=new StringBuilder();
        sub(subRoot);
        String s1=st.toString();
        System.out.print(s+" "+s1);
        return s.contains(s1);
    }
    public void sub(TreeNode root){
        if(root==null) {
            st.append("*");
            return ;
            }
        st.append(root.val);
        sub(root.left);
        sub(root.right);
    }
}
