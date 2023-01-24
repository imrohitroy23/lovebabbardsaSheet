class isomorphic{
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         if(root1==null && root2==null) return true;
         if(root1==null || root2==null ) return false;
         if(root1.data!=root2.data) return false;
         boolean a=isIsomorphic(root1.left,root2.left);
         boolean b=isIsomorphic(root1.right,root2.right);
         boolean c=isIsomorphic(root1.left,root2.right);
         boolean d=isIsomorphic(root1.right,root2.left);
         
         return a&&b||c&&d;
    }
    
}