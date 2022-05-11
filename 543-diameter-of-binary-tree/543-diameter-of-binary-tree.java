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
    static int ans = -(int)1e9;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = -(int)1e9;
        diameter(root);
        return ans;
    }
    public int diameter(TreeNode root){
        if( root == null ){
            return -1;
        }
        
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        
        ans = Math.max(ans, lh + rh + 2);
        
        int height = Math.max(lh, rh) + 1;
        return height;
    }
}