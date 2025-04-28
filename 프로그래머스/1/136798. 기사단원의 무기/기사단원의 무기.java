class Solution {
    public int solution(int number, int limit, int power) {

        int total = 0;
        for(int i = 1; i <= number; i++){
            int cnt = primeCnt(i);

            if(cnt > limit){
                total += power;
            }else{
                total += cnt;
            }
        }
        return total;
    }

    static int primeCnt(int n){
        int cnt = 1;
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        return cnt;
    }
}