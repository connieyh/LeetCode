/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if(root==null) {
            return result;
        }
        stk.push(root);
        while(!stk.isEmpty()) {
            TreeNode cur = stk.pop();
            result.add(cur.val);
            if(cur.right!=null) {
                stk.push(cur.right);
            }
            if(cur.left!=null) {
                stk.push(cur.left);
            }
        }
        return result;
    }
}