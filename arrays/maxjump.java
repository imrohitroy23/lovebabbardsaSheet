public class maxjump {
    static int minJumps(int[] arr){
        // your code here
        int c=0;
        int curr=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,i+arr[i]);
            if(curr>=arr.length-1) break;
            else if(max<=i) return -1;
            else if(i==curr){
                curr=max;
                c++;
            }
        }
        return c;
    }
}
