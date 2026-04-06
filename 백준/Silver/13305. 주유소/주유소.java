import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Long[] distinct = Arrays.stream(br.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
        Long[] price = Arrays.stream(br.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
        long res = 0;
        long min = price[0];

        for (int i = 0; i < n-1; i++) {
            if(price[i] >= min){
                res += min * distinct[i];
            }else{
                min = price[i];
                res += price[i] * distinct[i];
            }
        }
        System.out.println(res);
    }

}