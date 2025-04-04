import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    static String preStr = "____";
    static String mainStr0 = "\"재귀함수가 뭔가요?\"";
    static String mainStr1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String mainStr2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String mainStr3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String mainStr4 = "라고 답변하였지.";
    static String finalStr = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static int N;
    static String[] arr = {mainStr1, mainStr2, mainStr3};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recur(N);
    }

    static void recur(int n) {
        System.out.println(preStr.repeat(N-n) + mainStr0);
        if(n == 0){
            real(n);
            return;
        }
        fake(n);
        recur(n-1);
        System.out.print(preStr.repeat(N - n));
        System.out.println(mainStr4);

    }


    static void fake(int n){
        for (String val : arr) {
            System.out.print(preStr.repeat(N - n));
            System.out.println(val);
        }
    }
    static void real(int n){
        System.out.println(preStr.repeat(N - n) + finalStr);
        System.out.println(preStr.repeat(N - n) + mainStr4);
    }

}
