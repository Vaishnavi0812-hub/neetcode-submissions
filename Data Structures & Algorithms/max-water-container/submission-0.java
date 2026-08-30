class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int lp=0, rp=heights.length-1;
        while(lp<rp){
            int width=rp-lp;
            int hgt=Math.min(heights[lp],heights[rp]);
            int vol=hgt*width;
            maxWater=Math.max(maxWater,vol);
            if(heights[lp]<heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}
