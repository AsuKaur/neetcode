class Solution {
    public String longestPalindrome(String s) {
        int resIdx=0,resLength=0;
        for(int i=0;i<s.length();i++){
            int l=i,r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>resLength){
                    resIdx=l;
                    resLength=r-l+1;
                }
                l--;
                r++;
            }
            l=i;r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>resLength){
                    resIdx=l;
                    resLength=r-l+1;
                }
                l--;
                r++;
            }
        }
        return s.substring(resIdx,resLength+resIdx);
    }
}
