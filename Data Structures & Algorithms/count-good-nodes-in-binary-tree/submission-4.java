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
    int ans = 0;
    public int goodNodes(TreeNode root) {
        countGN(root, root.val);
        return ans;
    }

    private void countGN(TreeNode node, int maxV){
        if(node.val >= maxV) ans++;
        if(node.left != null)
        countGN(node.left, Math.max(node.val, maxV));
        if(node.right != null)
        countGN(node.right, Math.max(node.val, maxV));
    }
}
