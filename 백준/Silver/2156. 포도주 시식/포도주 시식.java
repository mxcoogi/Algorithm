import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            int[] dp = new int[n+1];
            int num;
            for(int i = 1; i < n+1; i++){
                num = Integer.parseInt(br.readLine());
                arr[i] = num;
            }

            dp[1] = arr[1];
            if(n == 1) {
                System.out.println(dp[1]);
                return ;
            } 
            dp[2] = dp[1] + arr[2];
            for(int i = 3; i < n+1; i++){
                dp[i]= Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
            }
        System.out.println(dp[n]);
    }
}