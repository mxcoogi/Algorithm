import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = Arrays.stream((""+x).split("")).mapToInt(Integer::parseInt).sum();
        if(x % sum == 0){
            answer = true;
        }
        return answer;
    }
}