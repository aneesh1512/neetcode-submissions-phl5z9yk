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


    public boolean isValidBST(TreeNode root) {
        return inOrder(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean inOrder(TreeNode node, int min, int max){
        if(node == null) return true;
        // if(node.left == null && node.right == null){
        //     sorted.add(node.val);
        //     return;
        // }
        if(node.val <= min || node.val >= max) return false;
        return inOrder(node.left, min, node.val) && inOrder(node.right, node.val, max);
    }
}
