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
    public void bfs(TreeNode node, LinkedList<List<Integer>> res){
        Queue<TreeNode> q = new ArrayDeque<>();
        if(node==null)return;
        q.add(node);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                list.add(current.val);
                if(current.left!=null)q.add(current.left);
                if(current.right!=null)q.add(current.right);
            }
            res.addFirst(list);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        bfs(root,res);
        return new ArrayList<>(res);
    }
}
