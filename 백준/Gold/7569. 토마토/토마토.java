import java.io.*;
import java.util.*;

public class Main {

    static int M, N, H;
    static int[][][] board;
    static Queue<int[]> q = new LinkedList<>();

    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        board = new int[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    board[h][i][j] = Integer.parseInt(st.nextToken());

                    // 🔥 시작점 (익은 토마토)
                    if (board[h][i][j] == 1) {
                        q.add(new int[]{h, i, j});
                    }
                }
            }
        }

        bfs();

        int max = 0;

        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {

                    if (board[h][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }

                    max = Math.max(max, board[h][i][j]);
                }
            }
        }

        // 처음이 1이니까 -1
        System.out.println(max - 1);
    }

    static void bfs() {
        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int z = cur[0];
            int x = cur[1];
            int y = cur[2];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nz < 0 || nx < 0 || ny < 0 || nz >= H || nx >= N || ny >= M)
                    continue;

                if (board[nz][nx][ny] == 0) {
                    board[nz][nx][ny] = board[z][x][y] + 1;
                    q.add(new int[]{nz, nx, ny});
                }
            }
        }
    }
}