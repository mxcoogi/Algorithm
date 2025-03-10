import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[1];
        if(n >= 2){
            dp[2] = arr[1] + arr[2];
        }
        int answer;
        for(int i = 3; i <= n; i++){
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i] ;
        }
        answer = dp[n];
        System.out.println(answer);


    }

}

