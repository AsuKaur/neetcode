class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        int num=n;
        int sum=0;
        while(true){
            sum=0;
            while(num!=0){
               sum+=Math.pow(num%10,2);
               num=num/10;
            }
            if(sum==1||seen.contains(sum)) break;
            else{
               seen.add(sum);
               num=sum;
            }
        }
        if(sum==1) return true;
        return false;
    }
}
