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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root, ans);
        return ans;
    }
    
    public void traversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);  // Visit the root node first
            traversal(root.left, result);  // Then visit the left subtree
            traversal(root.right, result);  // Finally visit the right subtree
        }
    }
}