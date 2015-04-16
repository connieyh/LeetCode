/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> lv = new LinkedList<>();
        q.add(root);
        lv.add(0);
        while(!q.isEmpty()) {
            TreeNode cur = q.poll();
            int v = lv.poll();
            if(cur.left!=null){
                q.add(cur.left);
                lv.add(v+1);
            }
            if(cur.right!=null){
                q.add(cur.right);
                lv.add(v+1);
            }
            if(v >= result.size()) {
                result.add(0, new ArrayList<Integer>());
            }
            result.get(0).add(cur.val);
        }
        return result;
        
        
    }
}