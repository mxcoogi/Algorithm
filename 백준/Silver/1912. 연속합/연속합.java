import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        long[] dp = new long[n];  dp[0] = Integer.parseInt(arr[0]);
        long max = dp[0];
        for(int i = 1; i < n; i++){
            long a = dp[i-1] + Integer.parseInt(arr[i]);
            long b = Integer.parseInt(arr[i]);
            dp[i] = a > b ? a : b;
            if(max < dp[i]) max = dp[i];

        }
        System.out.println(max);



    }
}