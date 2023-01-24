public class rightview {
    ArrayList<Integer> rightView(Node node) {
        //add code here.
         ArrayList<Integer> al=new  ArrayList<Integer>();
         Queue<Node> q=new LinkedList<>();
         if(node==null) return al;
         q.add(node);
         while(!q.isEmpty()){
             int s=q.size();
             for(int i=0;i<s;i++){
                 Node t=q.poll();
                 if(i==0) al.add(t.data);
                 if(t.right!=null) q.add(t.right);
                 if(t.left!=null) q.add(t.left);
                 
             }
         }
         return al;
    }
}
