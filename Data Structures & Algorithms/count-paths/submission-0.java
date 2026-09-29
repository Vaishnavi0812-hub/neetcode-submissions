class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,m,n,dp);
    }
    public int solve(int i, int j, int m, int n,int dp[][]){
        if(i<0 || i==m || j<0|| j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int w1=solve(i+1,j,m,n,dp);
        int w2=solve(i,j+1,m,n,dp);
        dp[i][j]=w1+w2;
        return dp[i][j];
    }
}
