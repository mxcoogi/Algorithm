
import java.util.*;
class Solution {
    public int solution(String s) {
        int len = s.length();
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String temp = it.next();
            if(s.contains(temp)){
                s = s.replaceAll(temp, String.valueOf(map.get(temp)));
            }
        }
        return Integer.parseInt(s);
    }
    static final Map<String, Integer> map = Map.of(
            "zero", 0,
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9
    );

}