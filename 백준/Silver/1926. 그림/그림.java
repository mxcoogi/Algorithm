import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());

            }
        }

        boolean[][] visit = new boolean[n][m];
        Queue<Node> queue = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 1 && !visit[i][j]){
                    int vol = 1;
                    queue.add(new Node(i, j));
                    visit[i][j] = true;
                    while(!queue.isEmpty()){
                        Node node = queue.poll();
                        for(int k=0; k < 4; k++){
                            int x = node.j + dx[k];
                            int y = node.i + dy[k];
                            if(x > m-1 || x < 0 || y > n-1|| y < 0){
                                continue;
                            }
                            if(board[y][x] == 1 && !visit[y][x]){
                                queue.add(new Node(y, x));
                                visit[y][x] = true;
                                vol++;
                            }
                        }
                    }
                    if(max < vol){
                        max = vol;
                    }
                    temp.add(vol);
                }
            }
        }
        System.out.println(temp.size());
        System.out.println(max);



    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


}
class Node{
    int i;
    int j;
    Node(int i, int j){
        this.i = i; //y
        this.j = j; //x
    }
}