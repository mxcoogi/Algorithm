import java.io.*;
import java.util.*;

public class Main {

    static int[][] board;
    static int[] dw = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dh = {-1,  0,  1, -1, 1, -1, 0, 1};
    static int cnt = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            if(W == 0 && H == 0){
                break;
            }
            board = new int[H][W];
            for(int h = 0; h < H; h++){
                st = new StringTokenizer(br.readLine());
                for(int w = 0; w < W; w++){
                    board[h][w] = Integer.parseInt(st.nextToken());
                }
            }
            for(int h = 0; h < H; h++){
                for(int w = 0; w < W; w++){
                    if(board[h][w] == 0){
                        continue;
                    }
                    cnt++;
                    dfs(h, w);

                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }

    static void dfs(int h, int w){
        if(board[h][w] == 0){
            return;
        }
        board[h][w] = 0;
        for(int i = 0; i < 8; i++){
            int nh = dh[i] + h;
            int nw = dw[i] + w;
            if(nh < 0 || nh >= board.length || nw < 0 || nw >= board[0].length){
                continue;
            }
            dfs(nh, nw);
        }
    }

}