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

    boolean ans = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        checkEqualTree(root, subRoot);
        return ans;
    }
   private void checkEqualTree(TreeNode root, TreeNode subRoot){
    if(root == null)    return;
    if(root.val == subRoot.val) 
    {
        if(check(root, subRoot)){
            ans = true;
        }
    }

    checkEqualTree(root.left, subRoot);
    checkEqualTree(root.right, subRoot);
   }


   private boolean check(TreeNode root, TreeNode subRoot){
    if(root == null || subRoot == null){
        if(!(root == null && subRoot == null)){
            return false;
        }
        return true;
    }
    if(root.val != subRoot.val){
        return false;
    }
    return check(root.left, subRoot.left) && check(root.right, subRoot.right);
    
   }
}
