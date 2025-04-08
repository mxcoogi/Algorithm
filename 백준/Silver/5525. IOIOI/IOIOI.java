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
        int answer = 0;
        int cnt = 0;
        char[] arr = str.toCharArray();
        int i = 0;
        while(i < len-2){
            if(arr[i] == 'I' && arr[i+1] == 'O' && arr[i+2] == 'I'){
                cnt++;
                i+=2;
            }
            else {
                cnt = 0;
                i++;
            }
            if(cnt == n){
                answer++;
                cnt--;
            }
        }
        System.out.println(answer);

    }

}

