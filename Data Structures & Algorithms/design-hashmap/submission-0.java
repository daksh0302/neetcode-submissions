class MyHashMap {
private int [] values;
private boolean[] keys;

    public MyHashMap() {
      keys = new boolean[1000001] ;
      values = new int[10000001];
    }
    
    public void put(int key, int value) {
        values[key] = value;
        keys[key] = true;
    }
    
    public int get(int key) {
      if(keys[key]){
        return values[key];
      }
      return -1;
    }
    
    public void remove(int key) {
        keys[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */