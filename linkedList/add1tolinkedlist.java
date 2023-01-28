public class add1tolinkedlist {
    
    public static Node addOne(Node head) 
    { 
        int c=add(head);
        if(c>0){
            Node node=new Node(c);
            node.next=head;
            return node;
        }
        return head;
        //code here.
    } 
    static int add(Node head){
        if(head==null) return 1;
        int res=head.data+add(head.next);
        head.data=(res)%10;
        return res/10;
    }
}
