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
    int temp = 0;
    public int kthSmallest(TreeNode root, int k) {
        // temp = k;
        smallK(root, k);
        return ans;
    }

    private void smallK(TreeNode node, int k){
        if(node == null) return;

        smallK(node.left, k);
        temp++;
        if(temp == k){
            ans = node.val;
        }
        smallK(node.right, k);
    }
}
