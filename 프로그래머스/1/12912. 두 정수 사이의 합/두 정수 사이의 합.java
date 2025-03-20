class Solution {
    public long solution(int a, int b) {
        long c = (long) a;
        long d = (long) b;
        long answer = 0;
        if(c > d){
            answer = (c-d+1)*(c+d) / 2;
        }else{
            answer = (d-c+1)*(c+d) / 2;
        }
        
        return answer;
    }
}