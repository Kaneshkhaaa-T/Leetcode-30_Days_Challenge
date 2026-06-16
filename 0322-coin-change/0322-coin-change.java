class Solution {
    public int coinChange(int[] coins, int target) {
        
        int n = coins.length;
        int[][] dp = new int[n][target+1];
        int INF = (int)1e9;

        for(int t=0;t<=target;t++){
            if(t%coins[0]==0) dp[0][t] = t/coins[0];
            else dp[0][t] = INF;
        }
        for(int i=1;i<n;i++){
            for(int t=0;t<=target;t++){
                int nottake = dp[i-1][t];
                int take = (int)1e9;
                if(t>=coins[i]) take = 1 + dp[i][t - coins[i]];
                dp[i][t] = Math.min(nottake,take);
            }
        }
        return dp[n - 1][target] >= INF
                ? -1
                : dp[n - 1][target];
    }
}