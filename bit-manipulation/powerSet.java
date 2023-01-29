public class powerSet {
     // Code here
     List<String> a = new ArrayList<>();
     int n = s.length();
     for(int j = 0; j < (1 << n); j++){
         String sub = "";
         for(int i = 0; i < n; i++){
             if((j & (1 << i)) == 0){
                 sub += s.charAt(i);
             }
         }
         if(sub.length() != 0)
         a.add(sub);
     }
     Collections.sort(a);
     return a;
 }
}
