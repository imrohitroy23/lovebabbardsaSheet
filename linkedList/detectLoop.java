public class detectLoop {
        HashSet<Node> hs=new HashSet<>();
        while(head!=null){
            if(hs.contains(head)) return true;
        
        hs.add(head);
        head=head.next;
        }
        return false;
    }
}
