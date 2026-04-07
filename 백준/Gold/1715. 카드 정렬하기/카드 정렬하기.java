import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int res = 0;
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();

            res += sum;
            if (pq.isEmpty()) {
                break;
            }
            pq.add(sum);
        }
        System.out.println(res);
    }

}