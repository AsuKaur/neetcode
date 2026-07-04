class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> n=new HashSet<>();
      for(int i:nums){
        n.add(i);
      }
      int longest=0;
      for(int i:n){
        int length=1;
        if(!n.contains(i-1)){
          while(n.contains(i+length)) length++;
        }
        longest=Math.max(longest,length);
      }
      return longest;
    }
}
