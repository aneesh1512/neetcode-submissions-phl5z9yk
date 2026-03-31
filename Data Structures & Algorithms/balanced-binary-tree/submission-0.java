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
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        checkedBTree(root);
        return ans;
    }

    private int checkedBTree(TreeNode root){
        int lh = 0;
        int rh = 0;

        if(root.left != null){
            lh = checkedBTree(root.left) + 1;
        }

        if(root.right != null){
            rh = checkedBTree(root.right) + 1;
        }

        if(Math.abs(lh - rh) > 1){
            ans = false;
        }

        return Math.max(rh, lh);
        
    }
}
