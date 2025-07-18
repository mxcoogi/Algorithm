import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        String[] arr = br.readLine().split(" ");
        int res = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.addLast(i);
        }


        for(int i = 0; i < m; i++){
            int target =  Integer.parseInt(arr[i]);
            int idx = list.indexOf(target);
            if(idx < list.size() - idx){
                int cnt = 0;
                while(cnt < idx){
                    int val = list.removeFirst();
                    list.addLast(val);
                    cnt++;
                }
                list.removeFirst();
                res += cnt;
            }else{
                int cnt = 0;
                while(cnt < list.size() - idx){
                    int val = list.removeLast();
                    list.addFirst(val);
                    cnt++;
                }
                list.removeFirst();
                res += cnt;
            }
        }
        System.out.println(res);
    }
}