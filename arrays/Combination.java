public class Combination {
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
    
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Collections.sort(A);
        combine(ans,A,B,0,new ArrayList<>());
        return ans;
    }
    static void combine(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> A,int B,int idx,List<Integer> ds)
    {
        if(B==0){
            if(!ans.contains(ds)){
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
        for(int i=idx;i<A.size();i++){
        if(i>idx && A.get(i)==A.get(i-1)) continue;
        if(A.get(i)>B) break;
        ds.add(A.get(i));
        combine(ans,A,B-A.get(i),i,ds);
        ds.remove(ds.size()-1);
        }
    }
}
