import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr =  new int[n][];
        int[][] dp  = new int[n][];
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            arr[i] = new int[i+1];
            dp[i] = new int[i+1];
            for(int j = 0; j < i+1; j++){
                arr[i][j] = Integer.parseInt(temp[j]);
                dp[i][j] = -1;
            }
        }
        dp[0][0] = arr[0][0];
        for(int i = 0; i < n-1; i++){
            for(int k = 0; k < i+1; k++){
                for(int j = 0; j < 2; j++){
                    if(dp[i+1][k+j] < arr[i+1][k+j] + dp[i][k]){
                        dp[i+1][k+j] = arr[i+1][k+j] + dp[i][k];
                    }
                }
            }
        }

        int max = -1;
        for(int val : dp[n-1]){
            max = Math.max(val, max);
        }

        System.out.println(max);


    }
}
