
class pair{
    Node root;
    int hd;
    public pair(int hd,Node root){
        this.hd=hd;
        this.root=root;
    }
}
class bottomView
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList <Integer> ans=new ArrayList <Integer>();
        Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.root;
            int ver=p.hd;
            map.put(ver,node.data);
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
    
}
