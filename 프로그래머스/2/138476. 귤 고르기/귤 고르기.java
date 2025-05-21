import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] arr = new int[tangerine[tangerine.length-1]+1];
        for(int val : tangerine){
            arr[val]++;
        }
        Arrays.sort(arr);
        int cnt = 0;
        for(int i = arr.length-1; i > 0; i--){
            cnt += arr[i];
            answer++;
            if(cnt >= k){
                break;
            }
        }
        return answer;
    }
}