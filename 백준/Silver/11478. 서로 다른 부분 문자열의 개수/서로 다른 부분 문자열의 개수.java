import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<String> set = new HashSet<>();
            for(int j = 0; j < s.length() - i; j++) {
                String temp = s.substring(j, j + i+1);
                set.add(temp);
            }
            res+= set.size();
        }
        System.out.println(res);
    }
}