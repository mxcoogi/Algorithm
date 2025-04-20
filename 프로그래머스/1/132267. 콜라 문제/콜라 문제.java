class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp;
        while(n >= a){
            temp = n / a * b;
            n = n % a;
            n += temp;
            answer += temp;
        }
        return answer;
    }
}