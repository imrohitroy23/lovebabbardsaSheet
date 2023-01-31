public class DetectCycleinUndirected {
    boolean vis[]=new boolean[v];
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<v;i++){
        q.add(i);
        vis[i]=true;
    
    while(!q.isEmpty()){
        int curr=q.poll();
         ArrayList<Integer> arr= adj.get(curr);
                for(var a : arr){
                if(q.contains(a)) return true;
                if(!vis[a]) q.add(a);
                vis[a] = true;
            }
    }
    
    }
    return false;
}
