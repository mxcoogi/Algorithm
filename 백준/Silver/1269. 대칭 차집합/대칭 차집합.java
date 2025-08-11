
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, m;
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        Set<String> set1 = new HashSet<>(Arrays.asList(s2));
        int res = 0;
        for(int i = 0; i < s1.length; i++) {
            String a = s1[i];
            if(set1.contains(a)){
                res ++;
            }
        }
        System.out.println(n + m - res*2);

    }
}