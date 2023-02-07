import java.util.*;
public class NonRepeating {
    public int[] singleNumber(int[] arr)
    {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int j=0;
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                res[j++]=i;
                
            }
        }
        Arrays.sort(res);
        return res;
    }
}
