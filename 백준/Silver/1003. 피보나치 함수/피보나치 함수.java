import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node[] dp = new Node[41];
        dp[0] = new Node(1, 0);
        dp[1] = new Node(0,1);
        for(int i = 2; i < dp.length; i++){
            dp[i] = new Node(dp[i-2].x + dp[i-1].x , dp[i-2].y + dp[i-1].y);
        }
        int t = Integer.parseInt(br.readLine());
        for(int i= 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            dp[n].xy();
        }
    }
}

class Node{
    int x;
    int y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    void xy(){
        System.out.println(x+" "+y);
    }

}

