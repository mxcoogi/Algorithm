import java.util.*;

class Solution {
    static int N;
    public String[] solution(String[] strings, int n) {
        N = n;
        String[] answer = Arrays.stream(strings).sorted(comparator).toArray(String[]::new);
        return answer;
    }
    static Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int n1= o1.charAt(N);
            int n2 = o2.charAt(N);
            if(n1 == n2){
                return o1.compareTo(o2);
            }
            return n1 - n2;
        }
    };
}