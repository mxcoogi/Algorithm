import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1000 - Integer.parseInt(br.readLine());
        int res = 0;
        int[] array= {500, 100, 50, 10 ,5, 1};
        for (int i = 0; i < 6; i++) {
            res += n /  array[i];
            n %= array[i];
        }
        System.out.println(res);

    }

}