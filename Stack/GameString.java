package Stack;

public class GameString {
    static int minValue(String s, int k){
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int arr[]=new int[map.size()];
        int i=0;
        for(Map.Entry<Character,Integer> en:map.entrySet()){
            arr[i++]=en.getValue();
        }
        int n=arr.length;
        for(int j=0;j<k;j++){
            Arrays.sort(arr);
            arr[n-1]-=1;
        }
        int ans=0;
        for(int j=0;j<n;j++){
            ans+=arr[j]*arr[j];
        }
        return ans;
    }
}
