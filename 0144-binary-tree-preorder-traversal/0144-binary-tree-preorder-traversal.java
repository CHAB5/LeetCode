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
        // LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> output = new ArrayList<>();
        
//         if ( root == null ) {
//             return output;
//         }
        
//         stack.add(root);
//         while (!stack.isEmpty()) {
//             TreeNode node = stack.pollLast();
//             output.add(node.val);
            
//             if (node.right != null) {
//                 stack.add(node.right);
//             }
            
//             if(node.left != null) {
//                 stack.add(node.left);
//             }
//         }
        
        helper(root, output);
        return output;
    }
    
    public void helper(TreeNode currentNode, List<Integer> res) {
        if ( currentNode != null) {
            res.add(currentNode.val);
            helper(currentNode.left, res);
            helper(currentNode.right, res);
        }
    }
}