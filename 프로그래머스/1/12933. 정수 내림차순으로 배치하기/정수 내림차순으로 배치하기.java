import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.IntStream;


class Solution {
    public long solution(long n) {
        IntStream stream = Arrays.stream(String.valueOf(n).split("")).sorted(comparator)
                .mapToInt(Integer::parseInt);
        Iterator<Integer> it = stream.iterator();
        StringBuilder sb=  new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next());
        }
        long answer = Long.parseLong(sb.toString());

        return answer;
    }
    
    
    static Comparator<String> comparator = new Comparator<String>(){
        @Override
        public int compare(String o1, String o2) {
            Integer a = Integer.parseInt(o1);
            Integer b = Integer.parseInt(o2);
            return b-a;
        }
    };
}