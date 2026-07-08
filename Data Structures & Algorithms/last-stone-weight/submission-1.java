class Solution {
    public int lastStoneWeight(int[] stones) {
        for(int i=stones.length-2;i>=0;i--){
            Arrays.sort(stones);
            int x=stones[i+1];
            int y=stones[i];
            if(x<y) stones[i]=y-x;
            else if(x>y) stones[i]=x-y;
            else stones[i]=0;
        }
        return stones[0];
    }
}
