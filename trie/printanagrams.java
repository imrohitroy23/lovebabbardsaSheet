public class printanagrams {
    public List<List<String>> Anagrams(String[] str) {
        // Code here
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String i:str){
            String t=i;
            char[] c=t.toCharArray();
            Arrays.sort(c);
            String cc=new String(c);
            if(!map.containsKey(cc)){
                map.put(cc,new ArrayList<>());
            }
            map.get(cc).add(t);
        }
         for(List<String> val: map.values()){
            ans.add(val);
        }
        return ans; 
    }
}
