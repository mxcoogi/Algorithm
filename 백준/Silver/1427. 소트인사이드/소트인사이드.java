import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] temp = br.readLine().split("");

        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2) - Integer.parseInt(o1);
            }
        });

        for(String var : temp){
            bw.write(var);
        }
        bw.flush();


    }
}
