public class waterpipes {
    static int ans=0;ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
    { 
         // code here
   ArrayList<ArrayList<Integer>> list = new ArrayList<>();
         int[] child = new int[n+1];
         int[] weight = new int[n+1];
         int[] parent = new int[n+1];
         
         for(int i=0;i<p;i++){
             int e = a.get(i);
             int f = b.get(i);
             int g = d.get(i);
             
             child[e] = f;
             parent[f] = e;
             weight[e] = g;
         }
        
         for(int i=1;i<=n;i++){
             if(parent[i]==0 && child[i]!=0){
                 ans = Integer.MAX_VALUE;
                 int w = dfs(i,child,weight);
                 ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(i);
                 temp.add(w);
                 temp.add(ans);
                 list.add(temp);
                 
             }
         }
         return list;
     }
       int dfs(int i,int[] child,int[] weight){
             if(child[i]==0){
                 return i;
             }
             ans = Math.min(ans,weight[i]);
             return dfs(child[i],child,weight);
         }
     }
 
}
