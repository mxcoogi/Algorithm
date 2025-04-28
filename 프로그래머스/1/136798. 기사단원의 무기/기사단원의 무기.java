class Solution {
    public int solution(int number, int limit, int power) {
        int[] primeCnt = new int[number+1];
        int total = 0;
        for(int i = 1; i <= number; i++){
            int cnt = primeCnt(i);
            primeCnt[i] = cnt;
            if(cnt > limit){
                total += power;
            }else{
                total += cnt;
            }
        }
        
        return total;
    }
    static int primeCnt(int n){
        int cnt = 0;
        for(int i = 1; i * i <= n; i++){
            if(i*i == n) cnt++;
            else{
                if(n % i == 0){
                    cnt+=2;
                }
            }
        }
        return cnt;
    }
}