import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s =  Long.parseLong(br.readLine());
        long res = 0;
        long i = 1;
        while(s > 0){
            s = s - i;
            res ++;
            i++;
            if(s < 0) res--;
        }
        System.out.println(res);

    }
}