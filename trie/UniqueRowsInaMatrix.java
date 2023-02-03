package trie;
import java.util.*;

public class UniqueRowsInaMatrix {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<r;i++){
            ArrayList<Integer> t=new ArrayList<>();
            for(int j=0;j<c;j++){
                t.add(a[i][j]);
            }
            if(!ans.contains(t)) ans.add(t);
            
        }
        return ans;
    }
}
