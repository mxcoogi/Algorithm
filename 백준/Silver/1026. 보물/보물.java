import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] array_A = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] array_B = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        List<Integer> list1 = Arrays.stream(array_A).sorted().collect(Collectors.toList());
        List<Integer> list = Arrays.stream(array_B).sorted().collect(Collectors.toList());

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += list1.get(n - 1 - i) * list.get(i);
        }
        System.out.println(sum);

    }
}