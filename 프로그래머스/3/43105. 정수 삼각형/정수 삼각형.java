class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];
        for(int i = 0; i < dp.length; i++) {
            dp[i] = new int[triangle[i].length];
        }
        dp[0][0] = triangle[0][0];

        for(int i = 0; i < triangle.length-1; i++) {
            for(int j = 0; j < triangle[i].length; j++) {
                if(dp[i+1][j] < dp[i][j] + triangle[i+1][j]) {
                    dp[i+1][j] = dp[i][j] + triangle[i+1][j];
                }
                if(dp[i+1][j+1] < dp[i][j] + triangle[i+1][j+1]) {
                    dp[i+1][j+1] = dp[i][j] + triangle[i+1][j+1];
                }
            }
        }
        int max = -1;
        for(int val : dp[dp.length-1]){
            if(max < val) max = val;
        }
        return max;
    }
}