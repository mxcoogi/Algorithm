import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            String s = br.readLine();
            isPalindrome(s);
        }

    }

    static void isPalindrome(String s) {

        recursion(s, 0, s.length() - 1, 1);
    }

    static void recursion(String s, int l, int r, int cnt) {
        if (l >= r) {
            System.out.println(1 + " " + cnt);
            return;
        }
        else if(s.charAt(l) != s.charAt(r)){
            System.out.println(0 + " " + cnt);
            return ;
        }
        recursion(s, l + 1, r - 1, cnt+1);
    }
}