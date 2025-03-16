import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
                String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++) {
            answer[i] = temp.charAt(temp.length() -i-1) - '0';
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}