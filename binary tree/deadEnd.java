public class deadEnd {
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return helper(root,1,Integer.MAX_VALUE);
        
    }
    static boolean helper(Node root,int min, int max){
        if(root==null) return false;
        if(min==max) return true;
        boolean ls=helper(root.left, min,root.data-1);
        boolean rs=helper(root.right,root.data+1,max);
        return ls ||rs;
    }
}
