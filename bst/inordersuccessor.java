public class inordersuccessor {
    Node next=null;
    public void populateNext(Node root){
        //code here
        if(root!=null){
            populateNext(root.right);
            root.next=next;
            next=root;
            populateNext(root.left);
        }
    }
}
