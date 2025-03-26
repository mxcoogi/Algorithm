class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int len = phone_number.length();
        for (int i = 0; i < len; i++) {
            if (i > len - 4-1) {
                answer.append(phone_number.charAt(i));
            } else {
                answer.append('*');
            }
        }
        return answer.toString();
    }
}