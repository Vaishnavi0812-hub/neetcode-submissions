class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans1=solve(cost,0,dp);
        int ans2=solve(cost,1,dp);
        return Math.min(ans1,ans2);
    }
    public int solve(int cost[], int i,int dp[]){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int w1=cost[i] + solve(cost,i+1,dp);
        int w2=cost[i] + solve(cost,i+2,dp);
        dp[i]=Math.min(w1,w2);
        return dp[i];
    }
}
