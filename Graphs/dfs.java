public class dfs {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        boolean vis[]=new boolean[V];
         dfs(0,adj,vis,ans);
    return ans;    }
    public void dfs(int i,ArrayList<ArrayList<Integer>> list,boolean [] vis,ArrayList<Integer> res){
        vis[i]=true;
        res.add(i);
        for(int ele : list.get(i))
        {
            if(vis[ele] != true)
            {
                dfs(ele,list,vis,res);
            }
        }
    }
}
