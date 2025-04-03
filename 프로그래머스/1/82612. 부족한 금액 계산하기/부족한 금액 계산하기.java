import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {

        long answer = LongStream.range(1, count + 1).map(c -> c * price).sum() - money;


        return answer > 0 ? answer : 0;
    }
}