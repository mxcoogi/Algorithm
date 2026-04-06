import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] array = Arrays.stream(br.readLine().split("")).map(Integer::parseInt)
                .toArray(Integer[]::new);
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                flag = true;
            }
            sum += array[i];
        }
        if(sum % 3 != 0 || !flag){
            System.out.println(-1);
            return;
        }
        Arrays.sort(array);
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i]);
        }


    }

}