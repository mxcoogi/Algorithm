import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    static int[] dx = {0, 1, 0, 1};
    static int[] dy = {0, 0, 1, 1};
    static int cnt = 0;
    static int R;
    static int C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int n = Integer.parseInt(temp.split(" ")[0]);
        R = Integer.parseInt(temp.split(" ")[1]);
        C = Integer.parseInt(temp.split(" ")[2]);
        int size = (int) Math.pow(2, n);
        //recur(n, 0, 0);
        find(size, 0, 0);
    }

    static void recur(int n, int x, int y){
        if(n == 1){
            for(int i = 0; i < 4; i++){
                int X = x + dx[i];
                int Y = y + dy[i];
                cnt++;
                if(Y == R && X == C){
                    System.out.println(--cnt);
                }
            }
            return ;
        }
        recur(n-1, x, y);
        recur(n-1, (int) (x + Math.pow(2, n-1)), y);
        recur(n-1, x, (int) (y + Math.pow(2, n-1)));
        recur(n-1, (int) (x + Math.pow(2, n-1)), (int) (y + Math.pow(2, n-1)));
    }

    static void find(int size, int y, int x){
        int newSize = size / 2;
        if(size == 1){
            System.out.println(cnt);
            return ;
        }
        if(R < newSize + y && C < newSize + x){
            find(newSize, y, x);
        } else if (R < newSize + y && C >= newSize + x) {
            cnt += newSize * newSize;
            find(newSize, y, newSize+x);
        }else if (R >= newSize + y && C < newSize + x) {
            cnt += newSize * newSize * 2;
            find(newSize, y + newSize, x);
        }else{
            cnt += newSize * newSize * 3;
            find(newSize, y + newSize, x+newSize);
        }


    }

}
