import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int idx = IntStream.range(0, seoul.length).filter(s -> seoul[s].equals("Kim")).sum();
        return answer + idx + "에 있다";
    }
}