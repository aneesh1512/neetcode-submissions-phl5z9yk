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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null || (root.left == null && root.right == null)){
            if(root == null) return ans;
            ans.add(Arrays.asList(root.val));
            return ans;
        }

         queue.offer(root);
        // ans.add(Array.asList(root.value));
        int curp = 1;
        int nextp = 0;
        List<Integer> subl = new ArrayList<>();
        while(!queue.isEmpty()){
            if(curp == 0){
                ans.add(subl);
                subl = new ArrayList<>();
                curp = nextp;
                nextp = 0;
            }
            TreeNode node = queue.poll();
            curp--;
            if(node.left != null){
                queue.offer(node.left);
                nextp++;
            }
            if(node.right != null){
                queue.offer(node.right);
                nextp++;
            }
            subl.add(node.val);
        }
        ans.add(subl);
        return ans;
    }

}
