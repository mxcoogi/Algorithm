import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수
        int[] div = new int[]{25, 10, 5, 1};

        int t =  Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int change = Integer.parseInt(br.readLine());
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < div.length; j++) {
                builder.append(change / div[j]).append(" ");
                change = change % div[j];
            }
            System.out.println(builder);
        }


    }
}