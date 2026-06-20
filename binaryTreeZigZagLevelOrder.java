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
    public static void bfs(TreeNode node, List<List<Integer>> res){
        if(node==null)return;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(node);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if(leftToRight){
                    list.add(current.val);
                }else{
                    list.addFirst(current.val);
                }
                if(current.left!=null)q.add(current.left);
                if(current.right!=null)q.add(current.right);
            } 
            if(leftToRight)leftToRight=false;
            else leftToRight=true;
            res.add(list);
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(root,res);
        return res;
    }
}
