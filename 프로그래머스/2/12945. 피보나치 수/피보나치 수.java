import java.util.*;

class Solution {
    public int solution(int n) {
        long mod = 1234567;
        List<Long> dp = new ArrayList<>();
        dp.add(0L);
        dp.add(1L);
        for(int i = 2; i <= n; i++){
            Long res = dp.get(i-1) + dp.get(i-2);
            dp.add(res % mod);
        }
        return (int)(dp.get(n) % mod);

    }

}