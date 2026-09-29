class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int [n+1][amount+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        } 
        return solve(coins,0,amount,dp);
    }
    public int solve(int coins[], int i, int amount,int dp[][]){
        if(i>=coins.length){
            return 0;
        }
        if(amount==0){
            return 1;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int w1=0,w2=0;
        if(coins[i]<=amount){
            w1=solve(coins,i,amount-coins[i],dp);
            w2=solve(coins,i+1,amount,dp);
        }else{
            w2=solve(coins,i+1,amount,dp);
        }
        dp[i][amount]= w1+w2;
        return dp[i][amount];

    }
}
