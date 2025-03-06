class Solution {
    public int solution(int num1, int num2) {
        float temp = (float) num1 / num2;
        int answer = (int) (temp * 1000);
        return answer;
    }
}