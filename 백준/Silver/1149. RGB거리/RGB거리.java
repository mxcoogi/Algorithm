import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        final int RED = 0;
        final int GREEN = 1;
        final int BLUE = 2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        int[][] dp = arr.clone();
        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][RED] = Integer.parseInt(str[0]);
            arr[i][GREEN] = Integer.parseInt(str[1]);
            arr[i][BLUE] = Integer.parseInt(str[2]);

            if(i != 0){
                dp[i][RED] = Math.min(dp[i-1][BLUE], dp[i-1][GREEN]) + arr[i][RED];
                dp[i][GREEN] = Math.min(dp[i-1][BLUE], dp[i-1][RED]) + arr[i][GREEN];
                dp[i][BLUE] = Math.min(dp[i-1][RED], dp[i-1][GREEN]) + arr[i][BLUE];
            }
        }

        System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2])));




    }
}