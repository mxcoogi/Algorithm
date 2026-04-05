import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, array[i] * (n-i));
        }
        System.out.println(max);

    }
}