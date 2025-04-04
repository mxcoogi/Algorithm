import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                int n = Integer.parseInt(br.readLine());
                int len = (int) Math.pow(3, n);
                char[] arr = new char[len];
                Arrays.fill(arr, '-');
                mergeSort(arr, 0, len);
                System.out.println(arr);
            } catch (RuntimeException e) {
                break;
            }
        }

    }
    static void mergeSort(char[] arr, int l, int r){
        if (l+1 >= r) return ;
        int range = (r-l) / 3;
        int midL = l + range;
        int midR = midL + range;
        Arrays.fill(arr, midL, midR,' ');
        mergeSort(arr, l, midL);
        mergeSort(arr, midR, r);
    }
}


