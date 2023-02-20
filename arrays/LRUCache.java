public class LRUCache {
    static LinkedHashMap<Integer,Integer> map;
    int MAX = 10;
    LRUCache(int cap)
    {
        
        this.MAX = cap;
        map = new LinkedHashMap<Integer,Integer>(cap,(float)0.75,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
                return size() > MAX;
            }
        };
    }
 

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        // your code here
        if(map.containsKey(key)) return map.get(key);
        return -1;
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        // your code here
    
        map.put(key,value);
    }
}
