public class Reverseingroup {
    public static Node reverse(Node head, int k)
    {
        //Your code here
        Node p=null;
        Node n=null;
        Node c=head;
        int cou=0;
        while(c!=null && cou<k){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
            cou++;
        }
        if(n!=null){
            head.next=reverse(n,k);
        }
        return p;
    }
}
