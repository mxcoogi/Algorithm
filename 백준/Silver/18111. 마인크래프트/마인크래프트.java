import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int minTime = 99999999;
    static int maxHeight = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int row = Integer.parseInt(temp[0]);
        int col = Integer.parseInt(temp[1]);
        int inventory = Integer.parseInt(temp[2]);
        int[][] arr = new int[row][col];
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < row; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        for(int k = min; k <= max; k++){
            int inven = inventory;
            all(arr, k, inven);
        }
        System.out.println(minTime+" "+maxHeight);

    }


    static void all(int[][] arr, int k, int inventory) {
        int time = 0;
        int inven = inventory;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == k) continue;
                else {
                    if (arr[row][col] > k) {
                        inven = inven + arr[row][col] - k;
                        time += 2 * (arr[row][col] - k);
                    } else {
                        inven = inven - (k - arr[row][col]);
                        time += k - arr[row][col];
                    }
                }
            }
        }
        if (inven >= 0) {
            //System.out.println("맞추려는 높이 : " + k + " time : " + time  + " height : " + k+ " inven : " + inven);
            if(minTime == time){
                if(maxHeight < k){
                    minTime = time;
                    maxHeight = k;
                }
            } else if (minTime > time) {
                minTime = time;
                maxHeight = k;
            }
        }
    }
}

