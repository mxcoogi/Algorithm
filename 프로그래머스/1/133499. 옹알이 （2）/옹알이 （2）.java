import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String val : babbling){
            answer += validBabbling(val);
        }
        return answer;
    }

    static int validBabbling(String babbling){
        List<String> ls = List.of("aya", "ye", "woo", "ma");
        for(int i = 0; i < ls.size(); i++){
            babbling = babbling.replaceAll(ls.get(i), String.valueOf(i));
        }
        for(int i = 1; i < babbling.length(); i++){
            if(babbling.toCharArray()[i] == babbling.toCharArray()[i-1]) {
                return 0;
            }
        }
        try {
            Integer.parseInt(babbling);
            return 1;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}