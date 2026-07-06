class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,res=0;
        Map<Character,Integer> list=new HashMap<>();
        for(int r=0;r<s.length();r++){
            if(list.containsKey(s.charAt(r))){
                l=Math.max(list.get(s.charAt(r))+1,l);
            }
            list.put(s.charAt(r),r);
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
