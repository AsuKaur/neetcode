class TimeMap {
    private Map<String, HashMap<Integer,List<String>>> list;

    public TimeMap() {
        list=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!list.containsKey(key)) list.put(key,new HashMap<>());
        if(!list.get(key).containsKey(timestamp)) list.get(key).put(timestamp,new ArrayList<>());
        list.get(key).get(timestamp).add(value);
    }
    
    public String get(String key, int timestamp) {
        if(!list.containsKey(key)) return "";
        int seen=0;
        for(int time:list.get(key).keySet()){
            if(time<=timestamp) seen=Math.max(seen,time);
        }
        if(seen==0) return "";
        int idx=list.get(key).get(seen).size()-1;
        return list.get(key).get(seen).get(idx);
    }
}
