import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            keyLogger();
        }

    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Stack<String> stackL = new Stack<>();
    static Stack<String> stackR = new Stack<>();

    static void keyLogger() throws IOException {
        String[] s = br.readLine().split("");
        StringBuilder answer = new StringBuilder();
        for(String str : s){
            operate(str);
        }
        while(!stackL.isEmpty()){
            stackR.push(stackL.pop());
        }
        while(!stackR.isEmpty()){
            answer.append(stackR.pop());
        }
        System.out.println(answer);
    }

    static void operate(String str){
        if (str.equals("<")) {
            if (!stackL.isEmpty()) {
                stackR.push(stackL.pop());
            }
        } else if (str.equals(">")) {
            if (!stackR.isEmpty()) {
                stackL.push(stackR.pop());
            }
        } else if (str.equals("-")) {
            if (!stackL.isEmpty()) {
                stackL.pop();
            }
        } else {
            stackL.push(str);
        }
    }
}
