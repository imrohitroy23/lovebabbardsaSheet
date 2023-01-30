public class rootatsamelevel {
    int c=0;
    boolean check(Node root)
    {
        return check1(root,1);
    }
	boolean check1(Node root, int level){
	 if(root==null)return true;
        if(root.left==null&&root.right==null){
            if(c==0){
                c=level;
            }
            return c==level;
    
        }
        return check1(root.left,level+1)&&check1(root.right,level+1);
    }
}
