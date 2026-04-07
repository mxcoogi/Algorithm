import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = {300, 60, 10};
        if(n % 10 != 0){
            System.out.println(-1);
            return;
        }
        for(int i = 0; i < 3; i++){
            System.out.print(n / array[i] + " ");
            n %= array[i];
        }
    }

}