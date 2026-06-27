/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public static Node dfs(Node node, HashMap<Node,Node> map){
        if(node == null) return null;
        if(map.containsKey(node)) return map.get(node);
        Node clone = new Node(node.val);
        map.put(node,clone);
        for(int i=0;i<node.neighbors.size();i++){    
            clone.neighbors.add(dfs(node.neighbors.get(i),map));
        }
        return clone;
    }
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<>();
        return dfs(node,map);
    }
}