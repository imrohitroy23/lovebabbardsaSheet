public class predecessorAndSuccessor {
    Node suc=null;
    Node pr=null;
    Node cur=root;
    while(cur!=null){
        if(key>=cur.data)
             cur=cur.right;
         else{
             suc=cur;
             cur=cur.left;
         }
    }
    s.succ=suc;
    cur=root;
    while(cur!=null){
       if(key<=cur.data)
           cur=cur.left;
         else{
           pr=cur;
           cur=cur.right;
         }
    }
    p.pre=pr;
    
 }
}
