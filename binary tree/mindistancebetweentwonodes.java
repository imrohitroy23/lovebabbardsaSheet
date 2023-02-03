public class mindistancebetweentwonodes {
    Node lca(Node root, int a, int b){
        if(root==null )return null;
        if(root.data==a ||root.data==b) return root;
        Node l=lca(root.left,a,b);
        Node r=lca(root.right,a,b);
        if(l==null) return r;
        if(r==null) return l;
        return root;
    }
    int findDit(Node root,int a ,int b){
        if(root==null) return -1;
        if(root.data==a) return b;
        int l=findDit(root.left,a,b+1);
        if(l!=-1) return l;
        return findDit(root.right,a,b+1);
    }
    
    
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca1=lca(root,a,b);
        int l=findDit(lca1,a,0);
        int r=findDit(lca1,b,0);
        return l+r;
        
    }
}
