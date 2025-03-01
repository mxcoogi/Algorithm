import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        boolean flag = false;
        StringBuilder answer = new StringBuilder();
        for(String val : s){
            if(val.equals("<")) {
                flag = true;
                while(!stack.isEmpty()){
                    answer.append(stack.pop());
                }
                answer.append(val);
                continue;
            }
            if(val.equals(">")){
                flag = false;
                answer.append(val);
                continue;
            }
            if(flag){
                answer.append(val);
            }else{
                if(val.equals(" ")){
                    while(!stack.isEmpty()){
                        answer.append(stack.pop());
                    }
                    answer.append(" ");
                }
                else{
                    stack.push(val);
                }
            }
        }
        while(!stack.isEmpty()){
            answer.append(stack.pop());
        }
        System.out.println(answer);
    }
}
