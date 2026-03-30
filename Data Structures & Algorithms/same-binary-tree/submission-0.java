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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkEqualTree(p, q);
    }

    private boolean checkEqualTree(TreeNode p, TreeNode q){
        boolean val = false;
        if( p == null && q == null){
            return true;
        }else if(p != null && q != null){
            val  = p.val == q.val;
        }else{
            val =  false;
        }
        return val && checkEqualTree(p.left, q.left) && checkEqualTree(p.right, q.right);
    }
}
