/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTreeRecursive {
    public boolean isSymmetric(TreeNode root) {
        if(root ==null) {
            return true;
        }
        return isSame(root.left, root.right);
        
    }
    public boolean isSame(TreeNode l, TreeNode r) {
        if(l==null && r==null) {
            return true;
        }
        if(l==null ^ r==null || l.val != r.val) {
            return false;
        }
        return isSame(l.left, r.right) && isSame(l.right, r.left);
        
        
    }
}