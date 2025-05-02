import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < reserve.length; i++) {
            int val = reserve[i];
            for(int j = 0; j < lost.length; j++){
                if(val == lost[j]){
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                }
            }
        }
        for(int val : lost){
            if(val == -1) continue;
            for (int i = 0; i < reserve.length; i++) {
                int target = reserve[i];
                if (target == -1) continue;
                if (target - 1 == val) {
                    answer++;
                    reserve[i] = -1;
                    break;
                }
                if(target+1 == val){
                    answer++;
                    reserve[i] = -1;
                    break;
                }

            }
        }

        return n+answer - lost.length;
    }
}
