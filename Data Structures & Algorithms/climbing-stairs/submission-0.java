class Solution {
    public int climbStairs(int n) {
        int ones=1,twos=1;
        for(int i=0;i<n-1;i++){
            int tmp=ones;
            ones=ones+twos;
            twos=tmp;
        }
        return ones;
    }
}
