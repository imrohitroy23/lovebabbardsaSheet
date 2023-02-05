public class recursivelyprintall {
    public static ArrayList<ArrayList<String>> sentences(String[][] list) {
        // code here
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        sentence(list,0,"",ans);
        return ans;
    }
    static void sentence(String[][] list, int i, String s, ArrayList<ArrayList<String>> ans) {
        if(i==list.length){
            String t[]=s.split(" ");
            ans.add(new ArrayList<String>(Arrays.asList(t)));
            return ;
        }
        
        String arr[]=list[i];
        for(String j:arr){
            sentence(list,i+1,s+j+" ",ans);
        }
    }
}
