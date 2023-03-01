public class revrselevelorder {
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
 
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(node==null) return ans;
        q.add(node);
        while(!q.isEmpty()){
            int n=q.size();
            int i=0;
            while(n-->0){
                Node t=q.poll();
               
                if(t.left!=null)q.add(t.left);
                if(t.right!=null) q.add(t.right);
                ans.add(i++,t.data);
            }
        }
         return ans;
    }
}
