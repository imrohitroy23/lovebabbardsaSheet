public class duplicateSubtree {
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    String sol(Node root){
        if(root==null) return "";
        
        String s="";
        if(root.left==null && root.right==null){
            s=root.data+"";
            return s;
        }
        s+=root.data;
        s+=" "+sol(root.left);
        s+=" "+sol(root.right);
        if(map.containsKey(s)) {
            map.put(s,map.get(s)+1);
        }
        else {
            map.put(s,1);
            
        }
        return s;
    }
    int dupSub(Node root) {
        // code here 
        if(root==null) return 0;
        sol(root);
        for(int l:map.values()) if(l>1) return 1;
        return 0;
    }
}
