import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;

        Arrays.sort(arr);
        answer = Arrays.stream(arr).filter(s->s % divisor == 0).toArray();
        if(answer.length == 0){
            return new int[] {-1};
        }
        return answer;
    }
}