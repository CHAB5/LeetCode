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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversalHelper(root, res);
        return res;
    }
    
    public void postorderTraversalHelper(TreeNode currentNode, List<Integer> res) {
        if ( currentNode == null) {
            return;
        }
        
        postorderTraversalHelper(currentNode.left, res);
        postorderTraversalHelper(currentNode.right, res);
        res.add(currentNode.val);
    }
}