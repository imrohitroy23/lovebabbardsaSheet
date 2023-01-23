public class deleteanode {
    static int max(Node root)
    {
        while(root.right!=null)
        {
            root=root.right;
        }
        
        return root.data;
    }
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int x) {
        // code here.
        if(root==null) return root;
        if(root.data>x){
            root.left=deleteNode(root.left,x);
        }
        else if(root.data<x) root.right=deleteNode(root.right,x);
        if(root.data==x){
            if(root.left!=null && root.right!=null){
                int lmax=max(root.left);
                root.data=lmax;
                root.left=deleteNode(root.left,lmax);
                return root;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
                
            }
            if(root.right!=null) return root.right;
            else {
                return null;
            }
        }
        return root;
    }
}
