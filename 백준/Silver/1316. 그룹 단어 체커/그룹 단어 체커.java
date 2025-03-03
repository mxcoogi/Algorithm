import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split("");
            HashSet<String> set = new HashSet<>();
            set.add(str[0]);
            for (int j = 1; j < str.length; j++) {
                String s = str[j];
                if(set.contains(s) && !str[j-1].equals(s)){
                    cnt++;
                    break;
                }
                set.add(s);
            }
        }
        System.out.println(n - cnt);


    }
}
