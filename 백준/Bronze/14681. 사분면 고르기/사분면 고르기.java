import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x * y > 0){
            if(x > 0){
                System.out.println(1);
            }
            else{
                System.out.println(3);
            }
        }else{
            if(x > 0){
                System.out.println(4);
            }else {
                System.out.println(2);
            }
        }

    }

}