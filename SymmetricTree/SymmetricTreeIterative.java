/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTreeIterative {
    public boolean isSymmetric(TreeNode root) {
        if(root==null || root.left==null && root.right==null){
            return true;
        }
        if(root.left==null ^ root.right==null || root.left.val!= root.right.val){
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()) {
            TreeNode out = q.poll();
            TreeNode in = q.poll();
            if(out==null ^ in==null || out.val!=in.val) {
                return false;
            }
            if(out.left!=null || in.right!=null){
                q.add(out.left);
                q.add(in.right);
            }
            if(out.right!=null || in.left!=null){
                q.add(out.right);
                q.add(in.left);
            }
        }
        return true;
    }
}