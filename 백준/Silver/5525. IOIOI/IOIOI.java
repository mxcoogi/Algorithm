import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        int size = 2 * n + 1;
        String st = "I" + "OI".repeat(n);
        for(int i = 0; i < len; i++){
            if(str.substring(i).startsWith(st)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}

