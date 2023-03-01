public class levelorder {
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(node==null) return ans;
        q.add(node);
        while(!q.isEmpty()){
            Node t=q.poll();
            ans.add(t.data);
            if(t.left!=null)q.add(t.left);
            if(t.right!=null) q.add(t.right);
        }
         return ans;
    }
}
