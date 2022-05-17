class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return helper(n,dp);
    }
    public int helper(int n , int[] dp){
        int count = 0;
        if( n< 0 ){
            return count;
        }
        else if( n == 0){
            count++;
            return count;
        }
        else{
            if( dp[n] > 0){
                return dp[n];
            }
            else{
                return dp[n] = helper(n-1,dp) + helper(n-2,dp);
            }
        }
    }
}