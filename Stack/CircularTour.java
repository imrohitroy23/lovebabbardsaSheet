public class CircularTour {
    int tour(int petrol[], int distance[])
    {
	
	  int n = petrol.length;
	  int curr=0;
      int balance=0;
      int start=0;
      for(int i=0;i<n;i++){
          curr+=petrol[i]-distance[i];
          balance+=petrol[i]-distance[i];
          if(curr<0){
              start=i+1;
              curr=0;
          }
          
          
      }
      if(balance>=0) return start;
          else return -1;
    }
}
