public class minval {
    int minValue(Node root) {
        if(root==null) return -1;
        if(root.left==null) return root.data;
        else return minValue(root.left);
        
    }
}
