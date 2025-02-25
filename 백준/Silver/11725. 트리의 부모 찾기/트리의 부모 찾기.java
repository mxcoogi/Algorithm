import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        int[] visit = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            arrayLists.add(new ArrayList<>());
            visit[i] = -1;
        }
        for(int i = 0; i < n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력된 숫자들을 받기 위한 StringTokenizer
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrayLists.get(x-1).add(y-1);
            arrayLists.get(y-1).add(x-1);

        }
        queue.add(0);
        ArrayList<Integer> ints;
        while(!queue.isEmpty()){
            int parent = queue.poll();
            ints = arrayLists.get(parent);
            for(int val : ints){
                if(visit[val] > 0){
                    continue;
                }
                visit[val] = parent+1;
                queue.add(val);
            }

        }
        for(int i = 1; i < n; i++){
            System.out.println(visit[i]);
        }


        br.close(); // BufferedReader 닫기
    }
}
