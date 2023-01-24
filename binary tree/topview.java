public class topview {
    
class Solution
{
    
    
   
        static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList <Integer> ans=new ArrayList <Integer>();
        Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.root;
            int ver=p.hd;
            if(!map.containsKey(ver))map.put(ver,node.data);
            if(node.left!=null){
                q.add(new pair(ver-1,node.left));
            }
            if(node.right!=null){
                q.add(new pair(ver+1,node.right));
            }
            
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;     
        
    }
     static class pair{
        Node root;
        int hd;
       public pair(int hd,Node root){
            this.root=root;
            this.hd=hd;
        }
        
    }
}
}
