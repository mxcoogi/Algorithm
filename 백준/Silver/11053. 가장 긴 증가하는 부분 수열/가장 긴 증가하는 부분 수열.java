import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        String[] temp = br.readLine().split(" ");
        for(int i = 1; i < n+1; i++){
            arr[i] = Integer.parseInt(temp[i-1]);
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        int max = 1;
        for(int i = 2; i < dp.length; i++){
            dp[i] = 1;
            for(int j = i-1; j >= 1; j--){
                if(arr[i] > arr[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j] + 1;
                }
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}