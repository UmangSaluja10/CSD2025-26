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
    static int sum;
    public static void buildSum(TreeNode node, int prev){
        if(node==null)return;
        int newNumber = prev*10+node.val;
        prev = newNumber;
        if(node.left == null && node.right == null)sum+=newNumber;
        buildSum(node.left,prev);
        buildSum(node.right,prev);
    }
    public int sumNumbers(TreeNode root) {
        sum=0;
        buildSum(root,0);
        return sum;
    }
}