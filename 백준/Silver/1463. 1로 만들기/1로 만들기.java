import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[x+3];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        if(x >= 4){
            for(int i = 4; i <= x; i++){
                if(i % 3 ==0 && i % 2 == 0){
                    dp[i] = Math.min(dp[i / 3] , Math.min(dp[i /2], dp[i - 1])) + 1;
                } else if (i % 3 == 0) {
                    dp[i] = Math.min(dp[i / 3], dp[i-1])+1;
                } else if (i % 2 == 0) {
                    dp[i] = Math.min(dp[i / 2], dp[i-1])+1;
                }else{
                    dp[i] = dp[i-1]+1;
                }
            }
        }
        System.out.println(dp[x]);
    }
}

