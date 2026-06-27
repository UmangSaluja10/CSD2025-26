/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public static Node cloned(Node node, HashMap<Node,Node> map){
        if(node==null)return null;
        if(map.containsKey(node))return map.get(node);
        Node clone = new Node(node.val);
        map.put(node,clone);
        clone.next = cloned(node.next,map);
        clone.random = cloned(node.random,map);
        return clone;
    }
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        return cloned(head,map);
        
    }
}