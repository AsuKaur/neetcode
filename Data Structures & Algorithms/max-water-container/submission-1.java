class Solution {
    public int maxArea(int[] heights) {
        int area=0;
        int l=0,r=heights.length-1;
        while(l<r){
          int minH=Math.min(heights[l],heights[r]);
          area=Math.max(area,minH*(r-l));
          if(heights[l]<=heights[r]) l++;
          else r--;
        }
        return area;
    }
}
