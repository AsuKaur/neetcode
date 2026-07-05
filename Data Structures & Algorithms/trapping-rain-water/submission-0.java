public class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0) return 0;
        int res=0;
        int l=0,r=height.length;
        int leftMax=height[l];
        int rightMax=height[r-1];
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                res=res+leftMax-height[l];
            }else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                res=res+rightMax-height[r];
            }
        }
        return res;
    }
}