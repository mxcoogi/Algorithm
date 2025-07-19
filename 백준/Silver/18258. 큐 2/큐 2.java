import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 속도 향상을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();
        // 큐로 사용할 LinkedList
        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine()); // 명령 개수

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    int value = Integer.parseInt(input[1]);
                    queue.addLast(value);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.removeFirst()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.getFirst()).append('\n');
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.getLast()).append('\n');
                    }
                    break;
            }
        }

        // 출력
        System.out.print(sb);
    }
}