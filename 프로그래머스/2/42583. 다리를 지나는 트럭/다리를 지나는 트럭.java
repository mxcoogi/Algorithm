import java.util.*;
class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int idx = 0;
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        int cur_weight = 0;
        while (cnt < truck_weights.length) {
            answer++;
            if(queue.size() == bridge_length) {
                Integer poll = queue.poll();
                if(poll != null && poll > 0){
                    cur_weight -= poll;
                    cnt++;
                }
            }
            if(idx < truck_weights.length && cur_weight + truck_weights[idx] <= weight) {
                queue.add(truck_weights[idx]);
                cur_weight += truck_weights[idx];
                idx++;
            }else{
                queue.add(0);
            }
        }
        return answer;
    }
}