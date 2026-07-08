class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res=getCount(res,s,i,i);
            res=getCount(res,s,i,i+1);
            int l=i,r=i;
        }
        return res;
    }

    private int getCount(int res,String s,int l,int r){
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                res++;
                l--;r++;
            }
            return res;
    }
}
