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
    List<List<Integer>> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        list=new ArrayList<>();
        change(root);
       List<Integer> l=new ArrayList<>();
        for(int i=0;i<list.size();i++){
             List<Integer> li=new ArrayList<>(list.get(i));
             l.add(li.get(li.size()-1));
        }
        return l;
    }
     public void change(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                l.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            list.add(new ArrayList<>(l));
        }

    }
}
