import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        char idx = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != idx) {
                idx = s.charAt(i);
                cnt++;
            }
        }
        System.out.println((cnt+1)/2);
    }
}