import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]); int m = Integer.parseInt(temp[1]);
        List<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        System.out.print("<");
        while(!list.isEmpty()){
            for(int i = 0; i < m-1; i++){
                int val = list.remove(0);
                list.add(val);
            }
            System.out.print(list.remove(0));
            if(!list.isEmpty()) System.out.print(", ");
        }
        System.out.print(">");


    }
}
