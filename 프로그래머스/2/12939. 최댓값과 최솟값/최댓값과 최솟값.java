import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        long[] temp = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
        long max = temp[0];
        long min = temp[0];
        for(long val : temp){
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
        }
        answer = min + " " +max;
        return answer;
    }
}