public class clonegraph {
    Node cloneGraph(Node node){
        HashMap<Node,Node> m = new HashMap<>();
        dfs(node, m);
        return m.get(node);
    }
    
    void dfs(Node node, HashMap<Node,Node> m)
    {
        m.put(node, new Node(node.val, new ArrayList<Node>()));
            
        for(Node i:node.neighbors)
        {
            if(!m.containsKey(i))
                dfs(i,m);
            m.get(node).neighbors.add(m.get(i));
        }
    }
}
