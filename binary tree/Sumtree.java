public class Sumtree {
    
	boolean isSumTree(Node root)
	{
             // Your code here
             if(root==null) return true;
             if(root.left==null && root.right==null)
             {
                 return true;
             }
                 isSumTree(root.left);
             isSumTree(root.right);
             
             int left=root.left==null?0:root.left.data;
             int right=root.right==null?0:root.right.data;
             
             if(left+right==root.data){
                 root.data=left+right+root.data;
                 return true;
             }
             
             return false;
	}
}
