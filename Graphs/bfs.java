class bfs{
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
    boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        ArrayList<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            int cur=q.remove();
            if(vis[cur]==true){
                continue;
            }
            list.add(cur);
            vis[cur]=true;
            for(int i:adj.get(cur)){
                if(vis[i]==false){
                    q.add(i);
                }
            }
        
        }
            return list;
    }
}
