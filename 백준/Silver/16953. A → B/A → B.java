import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        boolean flag = false;
        int answer=-1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, a));
        while(!queue.isEmpty()){
            Node node = queue.poll();
            long data = node.data;
            if(data == b){
                flag = true;
                answer = node.degree+1;
                break;
            }
            long left = data * 2;
            long right = data*10+1;
            if(left <= b){
                queue.add(new Node(node.degree+1, left));
            }
            if(right <= b){
                queue.add(new Node(node.degree+1, right));
            }

        }

        System.out.println(answer);
    }
}

class Node{
    int degree;
    long data;
    Node(int degree, long data){
        this.data = data;
        this.degree = degree;
    }
}
