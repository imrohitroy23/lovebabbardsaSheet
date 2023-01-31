public class DetectCycleinDirected {
    public boolean detect(int src,ArrayList<ArrayList<Integer>> adj ,int[] vis,int[] pathvis){
        vis[src]=1;
        pathvis[src]=1;
        for(int k:adj.get(src)){
            if(vis[k]==0){
                if(detect(k,adj,vis,pathvis)) {
                    return true;
                    
                }
            }
            else{
                if(pathvis[k]==1) return true;
            }
        }
        pathvis[src]=0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] vis=new int[V];
        int[] pathvis=new int[V];
       for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(detect(i,adj,vis,pathvis))  return true;
            }
            
        }
        return false;
    }

}
