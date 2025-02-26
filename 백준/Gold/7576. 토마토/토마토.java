import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int check = 0;
        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1){
                    Node node = new Node(i, j);
                    nodeList.add(node);
                }
                if(board[i][j] == 0){
                    check++;
                }
            }
        }
        int day = 0;

        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        List<Node> temp = new ArrayList<>();
        while(!nodeList.isEmpty()){
            for(Node node : nodeList){

                for(int cnt = 0; cnt < 4; cnt++){
                    int x = node.j + dx[cnt];
                    int y = node.i + dy[cnt];
                    if(x > m-1 || x < 0 || y > n-1 || y < 0){
                        continue;
                    }
                    if(board[y][x] == 0){
                        board[y][x] = 1;
                        check--;
                        temp.add(new Node(y, x));
                    }
                }
            }
            nodeList.clear();
            nodeList.addAll(temp);
            temp.clear();
            day++;
        }
        if(check == 0){
            System.out.println(day-1);
        }
        else{
            System.out.println(-1);
        }


    }
}

class Node{
    int i;
    int j;
    public Node(int i, int j){
        this.i = i;
        this.j = j;
    }
}
