package SearchingSorting;

public class search {
    static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   int max=1;
	   int c=1;
	   Arrays.sort(arr);
	   for(int i=1;i<N;i++){
	       if(arr[i]-arr[i-1]==1){
	           c++;
	       }
	    else if(arr[i]!=arr[i-1]){
	           c=1;
	       }
	       max=Math.max(c,max);
	   }
	  
	   return max;
	}
}
