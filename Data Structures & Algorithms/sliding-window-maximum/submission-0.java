class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=k-1;
        int[] res=new int[nums.length-k+1];
        while(r<nums.length){
            int max=Integer.MIN_VALUE;
            for(int i=l;i<=r;i++){
                max=Math.max(max,nums[i]);
            }
            res[l]=max;
            l++;r++;
        }
        return res;
    }
}
