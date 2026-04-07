import java.io.*;
import java.util.*;

public class Main {
    static class Jewel {
        int weight, value;
        Jewel(int w, int v) {
            weight = w;
            value = v;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Jewel[] jewels = new Jewel[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewels[i] = new Jewel(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        // 1. 정렬
        Arrays.sort(jewels, (a, b) -> a.weight - b.weight);
        Arrays.sort(bags);

        // 2. 최대 힙 (가격 기준)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long result = 0;
        int j = 0;

        // 3. 가방 순회
        for (int i = 0; i < K; i++) {
            // 현재 가방에 담을 수 있는 보석 넣기
            while (j < N && jewels[j].weight <= bags[i]) {
                pq.add(jewels[j].value);
                j++;
            }

            // 가장 비싼 보석 선택
            if (!pq.isEmpty()) {
                result += pq.poll();
            }
        }

        System.out.println(result);
    }
}