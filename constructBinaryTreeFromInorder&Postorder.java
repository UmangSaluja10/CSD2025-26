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
    static int postEnd;
    public TreeNode build(int inStart, int inEnd, int[] postorder, int[] inorder, HashMap<Integer,Integer> map){
        if(inStart > inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inIndex = map.get(root.val);
        if(postEnd>=0)postEnd--;
        root.right = build(inIndex+1,inEnd,postorder,inorder,map);
        root.left = build(inStart,inIndex-1,postorder,inorder,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        postEnd = postorder.length-1;
        TreeNode root = build(0,inorder.length-1,postorder,inorder,map);
        return root;
    }
}



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
class Solution {
    public static TreeNode build(int postEnd, int inStart, int inEnd, int[] postorder, int[] inorder, HashMap<Integer,Integer> map){
        if(inStart > inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inIndex = map.get(root.val);
        int leftSize = inIndex-inStart;
        root.left = build(postEnd-1,inStart,inIndex-1,postorder,inorder,map);
        root.right = build(postEnd-leftSize,inIndex+1,inEnd,postorder,inorder,map);
        return root;
    }
    public TreeNode buildTree(int[] postorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = build(postorder.length-1,0,inorder.length-1,postorder,inorder,map);
        return root;
    }
}
 */
