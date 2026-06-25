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
    public static void buildList(TreeNode node){
        if(node==null)return;
        if(node.left!=null){
            TreeNode temp = node.left;
            while(temp.right!=null){
                temp=temp.right;
            }
            temp.right = node.right;
            node.right=node.left;
            node.left=null;
        }
        buildList(node.right);
    }
    public void flatten(TreeNode root) {
        buildList(root);
    }
}
