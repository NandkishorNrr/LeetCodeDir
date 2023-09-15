class Pair{
    int timestamp;
    String val;
    
    Pair(int timestamp , String val){
        this.timestamp = timestamp;
        this.val = val;
    }
}

class TimeMap {
    
    HashMap<String , ArrayList<Pair>> map;
    
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).add(new Pair(timestamp , value));
        }
        else{
            ArrayList<Pair> temp = new ArrayList<>();
            temp.add(new Pair(timestamp , value));
            map.put(key , temp);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            ArrayList<Pair> list = map.get(key);
            int i = 0;
            int j = list.size()-1;
            String cand = "";
            
            if(list.get(i).timestamp>timestamp) return "";
            if(list.get(j).timestamp<=timestamp) return list.get(j).val;
            
            while(i<=j){
                int mid = (i+j)/2;
                int timeVal = list.get(mid).timestamp;
                if(timeVal==timestamp){
                    return list.get(mid).val;
                }
                else if(timeVal<timestamp){
                    cand = list.get(i).val;
                    i = mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            return cand;
        }
        
        return "";
    }
}