import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(pq::add);
        while(!pq.isEmpty() && pq.peek() < K) {
            Integer first = pq.poll();
            Integer second = pq.poll();
            if(second == null){
                break;
            }
            answer++;
            pq.add(first + (second * 2));
        }
        if(!pq.isEmpty() && pq.peek() >= K){
            return answer;
        }else{
            return -1;
        }
    }
}


