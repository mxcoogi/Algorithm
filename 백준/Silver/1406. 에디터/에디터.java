import java.io.*;
import java.util.*;

public class Main {
    static Stack<String> stackL = new Stack<>();
    static Stack<String> stackR = new Stack<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        for(int i = 0; i < s.length(); i++){
            stackL.push(String.valueOf(s.charAt(i)));
        }
        int n = Integer.parseInt(br.readLine());
        for(int i =0 ; i < n; i++){
            operate();
        }
        while(!stackL.isEmpty()){
            stackR.push(stackL.pop());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!stackR.isEmpty()){
            bw.write(stackR.pop());
        }
        bw.flush();
        

    }

    static void operate() throws IOException {
        String s = br.readLine();
        char op = s.charAt(0);
        String temp;
        switch (op){
            case 'L':
                if(stackL.isEmpty()){
                    break;
                }
                temp = stackL.pop();
                stackR.push(temp);
                break;
            case 'D':
                if(stackR.isEmpty()){
                    break;
                }
                temp = stackR.pop();
                stackL.push(temp);
                break;
            case 'B':
                if(stackL.isEmpty()) break;
                stackL.pop();
                break;
            case 'P':
                stackL.push(String.valueOf(s.charAt(2)));
                break;
            default: break;
        }
    }
}
