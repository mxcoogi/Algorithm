class Solution {
    public String solution(int n) {
        String pattern = "수박";
        StringBuilder answer = new StringBuilder();
        String temp;
        for (int i = 0; i < n / 2; i++) {
            answer.append(pattern);
        }

        if (n % 2 == 0) {
            temp = answer.toString();
        } else {
            temp= answer.toString() + "수";
        }
        return temp;
    }
}