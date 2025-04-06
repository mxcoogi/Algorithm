import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] color = {0,0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        recur(0,0,n,arr);
        System.out.println(color[0]+"\n"+color[1]);
    }//흰색은 0 파란색은 1

    static void recur(int row, int col ,int size, int[][] arr){

        int pre = arr[row][col];
        boolean flag = false;
        for(int i = row; i < row+size; i++){
            for(int j = col; j < col+size; j++){
                if(pre != arr[i][j]){
                    flag= true;
                    break;
                }
            }
            if(flag) break;
        }

        if(!flag){
            color[pre]++;
            //System.out.println(row + ", " + col + "size : "+size +"의 색상은 " + COLOR.values()[pre]);
        }else{
            size = size / 2;
            recur(row, col, size, arr);
            recur(row+size, col, size, arr);
            recur(row, col+size, size, arr);
            recur(row+size, col+size, size, arr);
        }



    }
}
