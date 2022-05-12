/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        if(p.val < curr.val && q.val < curr.val){
            root= lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val > curr.val && q.val > curr.val){
            root= lowestCommonAncestor(root.right,p,q);
        }
        if((p.val > curr.val && q.val < curr.val) || (p.val < curr.val && q.val > curr.val)){
            return curr;
        }
        return root;
    }
}