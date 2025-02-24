import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine()); // 각 테스트 케이스의 숫자 개수
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력된 숫자들을 받기 위한 StringTokenizer

            int[] arr = new int[n]; // 숫자를 저장할 배열

            // StringTokenizer를 사용해 숫자들을 배열에 저장
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken()) -1;
            }

            int cnt = 0;
            boolean[] visit = new boolean[n];
            for(int k = 0; k < n; k++){
                int val = k;
                if(visit[val]) continue;
                while(true){
                    if(visit[val]){
                        break;
                    }
                    visit[val] = true;
                    val = arr[val];
                }
                cnt++;
            }
            System.out.println(cnt);
        }

        br.close(); // BufferedReader 닫기
    }
}
