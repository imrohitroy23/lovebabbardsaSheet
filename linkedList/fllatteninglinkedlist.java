public class fllatteninglinkedlist {
    
    Node flatten(Node root)
    {
	// Your code here
	if(root==null || root.next==null) return root;
	root.next=flatten(root.next);
	root=mer(root,root.next);
	return root;
    }
    Node mer(Node a, Node b){
        if(a==null) return b;
        if(b==null) return a;
        Node res=null;
        if(a.data<b.data){
            res=a;
            a.bottom=mer(a.bottom,b);
        }
        else{
            res=b;
            b.bottom=mer(b.bottom,a);
        }
        return
    }
}
