class Solution {
    public long solution(long n) {
        long answer = -1;
        double a = Math.sqrt(n);
        long b = (long)a;
        if(b == a){
                answer = (b+1)*(b+1);
            }
        return answer;
    }
}