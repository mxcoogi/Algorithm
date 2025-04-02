import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(chars);
        for(int i = 0 ; i < chars.length; i++){
            sb.append(chars[chars.length -1 -i]);
        }
        return sb.toString();
    }
}