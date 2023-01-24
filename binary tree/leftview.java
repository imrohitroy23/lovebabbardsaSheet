public class leftview {
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans=new ArrayList<Integer>();
      if(root==null ) return ans;
      int c=1;
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          ans.add(q.peek().data);
          c=q.size();
          while(c-->0){
              root=q.remove();
              if(root.left!=null) q.add(root.left);
              if(root.right!=null) q.add(root.right);
              
          }
      }
      return ans;
    }
}
