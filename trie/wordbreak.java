public class wordbreak {
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<B.size();i++) {
            mp.put(B.get(i),1);
        }
        return search(mp,A,0,A.length());
    }
    static int search(Map<String,Integer> map, String a, int i, int n){
        if(i==n) return 1;
        for(int j=i+1;j<=n;j++){
            if(map.get(a.substring(i,j))!=null && map.get(a.substring(i,j))==1){
                if(search(map,a,j,n)==1){
                    return 1;
                }
              
            }
        }
        return 0;
    }
}
