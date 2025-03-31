import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        long answer;
        answer = IntStream.range(0, a.length).map(s->a[s]*b[s]).sum();
        return (int)answer;
    }
}