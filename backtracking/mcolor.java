public class mcolor {
   
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] color=new int[n];
        return sol(0,graph,color,m,n);
    }
    static boolean isSafe(int node,boolean graph[][],int color[],int m, int n,int col){
    
        for(int i=0;i<n;i++){
            if(graph[node][i] && color[i]==col) return false;
            
        }
        return true;
        
    }
    
    static boolean sol(int node, boolean graph[][],int color[],int m, int n){
        if(node==n) return true;
        for(int col=1;col<=m;col++){
            if(isSafe(node,graph,color,m,n,col)){
                color[node]=col;
                if(sol(node+1,graph,color,m,n)) return true;
                color[node]=0;
            }
        }
    return false;
        
    }
}
