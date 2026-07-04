class Solution {
    public int maxArea(int[] heights) {
        int area=0;
        for (int i=0;i<heights.length-1;i++){
        for (int j=i+1;j<heights.length;j++){
            int minH= Math.min(heights[i],heights[j]);
            int maxH= Math.max(heights[i],heights[j]);
            int a=minH*(j-i);
            area=area<a?a:area;
        }
        }
        return area;
    }
}
