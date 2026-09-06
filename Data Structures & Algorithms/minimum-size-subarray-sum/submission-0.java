class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=0, minLen=Integer.MAX_VALUE;
        int lp=0, rp=0, sum=0;
        while(rp<nums.length){
            sum+=nums[rp];
            while(sum>=target){
                len=rp-lp+1;
                minLen=Math.min(len,minLen);
                sum-=nums[lp];
                lp++;
            }
            rp++;
            
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}