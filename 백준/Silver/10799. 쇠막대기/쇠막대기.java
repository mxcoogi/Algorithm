import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            if (str.equals("(")) {
                stack.push(str);
            }else{
                String pre = s[i-1];
                if(pre.equals("(")){
                    stack.pop();
                    answer += stack.size();
                }else{
                    stack.pop();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
