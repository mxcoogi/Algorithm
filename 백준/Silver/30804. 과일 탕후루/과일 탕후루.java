import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        String[] temp = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        int l = 0;  int maxLen = -1;

        for(int r = 0; r < arr.length; r++){
            map.put(arr[r], map.getOrDefault(arr[r], 0)+1);
            while(map.size()>2){
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l]) == 0) map.remove(arr[l]);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        System.out.println(maxLen);

    }
}

