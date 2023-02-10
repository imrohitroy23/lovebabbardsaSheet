public class countpairs {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int c=0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i:arr){
            if(m.containsKey(k-i)){
                c+=m.get(k-i);
            }
            m.put(i,m.getOrDefault(i,0)+1);
        }
        return c;
    }
}
