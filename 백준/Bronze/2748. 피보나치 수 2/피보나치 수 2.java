import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            long[] dp = new long[n+1];
            dp[1] = 1;
            if(n == 1){
                System.out.println(dp[1]);
                return;
            }
            for(int i = 2; i < n+1; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
        System.out.println(dp[n]);

    }
}