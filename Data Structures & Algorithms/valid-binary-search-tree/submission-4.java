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

    List<Integer> sorted = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        System.out.println(sorted);
        int n = sorted.size();
        for(int i = 1; i < n; i++){
            if(sorted.get(i) <= sorted.get(i-1)){
                return false;
            }
        }
        return true;
    }

    private void inOrder(TreeNode node){
        if(node == null) return;
        if(node.left == null && node.right == null){
            sorted.add(node.val);
            return;
        }
        inOrder(node.left);
        sorted.add(node.val);
        inOrder(node.right);
    }
}
