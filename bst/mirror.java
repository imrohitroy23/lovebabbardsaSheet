public class mirror {
    Map<Integer, String> map = new HashMap<>();
    Map<Integer, String> map2 = new HashMap<>(); 
    for(int i=0;i<A.length;i+=2){
        if(map.containsKey(A[i])){
            String s=String.valueOf(A[i+1])+" "+map.get(A[i]);
            map.put(A[i],s);
        }
        else{
            String s=String.valueOf(A[i+1]);
            map.put(A[i],s);
        }
    }
     for(int i=0;i<B.length;i+=2){
        if(map2.containsKey(B[i])){
            String s=map2.get(B[i])+" "+String.valueOf(B[i+1]);
            map2.put(B[i],s);
        }
        else{
            String s=String.valueOf(B[i+1]);
            map2.put(B[i],s);
        }
    }
    return map.equals(map2)?1:0;
}
}
