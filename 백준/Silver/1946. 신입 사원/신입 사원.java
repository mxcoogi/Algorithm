import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Score[] array = new Score[n];
            for(int j=0;j<n;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                array[j] = new Score(j, Integer.parseInt(st.nextToken()),  Integer.parseInt(st.nextToken()));
            }
            Arrays.sort(array, (a, b) -> a.a - b.a);
            int res = 1;
            int min = array[0].b;
            for(int j=1;j<n;j++){
                if(array[j].b < min){
                    res++;
                    min = array[j].b;
                }
            }
            System.out.println(res);
        }

    }
    static class Score{
        int idx;
        int a;
        int b;
        public Score(int idx, int a, int b) {
            this.idx = idx;
            this.a = a;
            this.b = b;
        }
    }
}