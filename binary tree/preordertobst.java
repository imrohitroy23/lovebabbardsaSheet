public class preordertobst {
    public static Node post_order(int pre[], int size) 
{
    //Your code here
    return bst(pre,Integer.MAX_VALUE, new int[]{0});
    
} 

static Node bst(int[] pre,int s,int[] i){
    if(i[0]==pre.length || pre[i[0]]>s ){
        return null;
    }
    Node root=new Node(pre[i[0]++]);
    root.left=bst(pre,root.data,i);
    root.right=bst(pre,s,i);
    return root;
}

}
