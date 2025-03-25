import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        return IntStream.range(0, absolutes.length)
                .map(s->signs[s] ? absolutes[s] : absolutes[s] * -1).sum();
    }
}