public class largestBst {
    static boolean isBst(Node root,int min, int max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max ) return false;
        return isBst(root.left,min,root.data) && isBst(root.right,root.data,max);
    }
    static int size(Node root){
        if(root==null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        if(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) return size(root);
        return Math.max(largestBst(root.left),largestBst(root.right));
    }
    
}
