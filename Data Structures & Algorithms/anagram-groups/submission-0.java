class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> list =new HashMap<>(); 
       for (String s:strs){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String newS = new String(ch);
        list.putIfAbsent(newS,new ArrayList<>());
        list.get(newS).add(s);
       }
       return new ArrayList<>(list.values());
    }
}
