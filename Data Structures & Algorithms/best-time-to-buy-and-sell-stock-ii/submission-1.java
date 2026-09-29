class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n+1][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        boolean buy=true;
        return solve(prices,0,buy,dp);
    }
    public int solve(int prices[], int i, boolean buy,int dp[][]){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy?1:0]!=-1){
            return dp[i][buy?1:0];
        }
        int prof1=0, prof2=0;
        if(buy==true){
            prof1=-prices[i]+solve(prices,i+1,false,dp);
            prof2=solve(prices,i+1,true,dp);
        }else{
            prof1=prices[i]+solve(prices,i+1,true,dp);
            prof2=solve(prices,i+1,false,dp);
        }
        dp[i][buy?1:0]=Math.max(prof1,prof2);
        return dp[i][buy?1:0];
    }
}