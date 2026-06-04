class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[]res=new int[n*2];
        int i=0;
        for(int j=0;j<nums.length;j++){
            res[i++]=nums[j];
        }
        for(int j=0;j<nums.length;j++){
            res[i++]=nums[j];
        }
        return res;
    }
}