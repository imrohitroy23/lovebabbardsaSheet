public class diagonalleveltraversal {
    public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           Queue<Node> q=new LinkedList<>();
           ArrayList<Integer> ans=new ArrayList<Integer>();
           q.add(root);
           while(!q.isEmpty()){
               Node first=q.poll();
                while(first!=null){
                    if(first.left!=null) q.add(first.left);
                    ans.add(first.data);
                    first=first.right;
                }
           }
           return ans;
      }
}
