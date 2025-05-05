import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int cnt = 0;
            while (cnt < index) {
                ch++;
                if (ch > 'z') ch = 'a';
                if (!skipSet.contains(ch)) {
                    cnt++;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}