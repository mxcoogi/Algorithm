class Solution {
    public int solution(String s) {
                int answer = s.charAt(0) == '-' ? Integer.parseInt(s.substring(1))* -1 :
                s.charAt(0) == '+' ? Integer.parseInt(s.substring(1)) : Integer.parseInt(s);
        return answer;
    }
}