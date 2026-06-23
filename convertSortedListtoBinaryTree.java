/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public static TreeNode build(ListNode node){
        if(node==null)return null;
        if(node.next==null)return new TreeNode(node.val);
        ListNode mid=node;
        ListNode last=node;
        ListNode prev=null;
        while(last!=null && last.next!=null){
            prev=mid;
            mid=mid.next;
            last=last.next.next;
        }
        TreeNode root = new TreeNode(mid.val);
        ListNode li2 = mid.next;
        if(prev==null)root.left=null;
        else{
            prev.next=null;
            ListNode li1=node;
            root.left=build(li1);
        }
        root.right=build(li2);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode root = build(head);
        return root;
    }
}
