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
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;


        queue.offer(root);


        while(!queue.isEmpty()){
            TreeNode lastNode = null;
            List<TreeNode> currentB = new ArrayList<>();
            while(!queue.isEmpty()){
                lastNode = queue.poll();
                if(lastNode.left != null){
                    currentB.add(lastNode.left);
                }

                if(lastNode.right != null){
                    currentB.add(lastNode.right);
                }

            }
            ans.add(lastNode.val);
            queue.addAll(currentB);
        }

        return ans;
    }
}
