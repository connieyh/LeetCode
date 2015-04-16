/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) {
            return true;
        }
        if(Math.abs(heightOf(root.left)-heightOf(root.right)) >=2) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int heightOf(TreeNode root) {
        if(root==null) {
            return 0;
        }
        return 1+Math.max(heightOf(root.left), heightOf(root.right));
    }
}