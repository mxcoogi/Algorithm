import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp;
        if(n < 5){
            dp = new int[]{-1, -1, -1, 1, -1, 1};
        }
        else{
            dp = new int[n+1];
            for(int i = 0; i < 6; i++){
                dp[i] = -1;
                if(i % 3 == 0) dp[i] = 1;
                if(i%5==0) dp[i] = 1;
            }
            for(int i = 6; i < n+1; i++){
                if(dp[i-3] < 0 && dp[i-5] < 0) dp[i] = -1;
                else if (dp[i-3] < 0) {
                    dp[i] = dp[i-5] + 1;
                } else if (dp[i-5] < 0) {
                    dp[i] = dp[i-3] + 1;
                }else{
                    dp[i] = Math.min(dp[i-3], dp[i-5])+1;
                }
            }
        }
        System.out.println(dp[n]);
    }

}

