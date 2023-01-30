public class Constructfrompreorderinorder {
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
         return CreateTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    }
    public static Node CreateTree(int[] inorder,int ilo,int ihi,int[] preorder,int plo,int phi){     
        if(ilo>ihi || plo>phi){
        return null;
    }
        Node nn=new Node(preorder[plo]);
        int idx=search(inorder,ilo,ihi,preorder[plo]);
        int net=idx-ilo;
        nn.left=CreateTree(inorder,ilo,idx-1,preorder,plo+1,plo+net);
        nn.right=CreateTree(inorder,idx+1,ihi,preorder,plo+net+1,phi);
        return nn;
    }
    public static int search(int[] in,int si,int ei,int item){
        for(int i=si;i<=ei;i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }
}
