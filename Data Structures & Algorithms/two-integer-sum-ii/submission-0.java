class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] id=new int[2];
        for (int i=0;i<numbers.length-1;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    id[0]=i+1;
                    id[1]=j+1;
                }
            }
        }
        return id;
    }
}
