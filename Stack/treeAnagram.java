package Stack;
import java.util.*;
public class treeAnagram {
    public static boolean areAnagrams(Node node1, Node node2) {
        // code here
        Queue<Node> q1=new LinkedList<>();
        Queue<Node> q2=new LinkedList<>();
        q1.add(node1);
        q2.add(node2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.size()!=q2.size()){
                return false;
            }
            int n=q1.size();
            List<Integer> temp1=new ArrayList<>();
            List<Integer> temp2=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node tempn1=q1.poll();
                Node tempn2=q2.poll();
                temp1.add(tempn1.data);
                temp2.add(tempn2.data);
                if(tempn1.left!=null) q1.add(tempn1.left);
                if(tempn1.right!=null) q1.add(tempn1.right);
                if(tempn2.left!=null) q2.add(tempn2.left);
                if(tempn2.right!=null) q2.add(tempn2.right);
                
            }
            Collections.sort(temp1);
            Collections.sort(temp2);
            if(temp1.size()!=temp2.size()) return false;
            
            for(int i=0;i<temp1.size();i++){
                if(!(temp1.get(i).equals(temp2.get(i)))){
                    return false;
            }
            }
        }
        return true;
    }
}
