import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(operations).forEach(e -> {
            String[] s = e.split(" ");
            String op = s[0];
            Integer num = Integer.parseInt(s[1]);
            if(op.equals("I")) {
                min.add(num);
                max.add(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }else {
                if (num > 0){
                    while(!max.isEmpty()){
                        Integer poll = max.poll();
                        if(map.getOrDefault(poll, 0) > 0){
                            map.put(poll, map.get(poll) - 1);
                            break;
                        }
                    }
                }else{
                    while(!min.isEmpty()){
                        Integer poll = min.poll();
                        if(map.getOrDefault(poll, 0) > 0){
                            map.put(poll, map.get(poll) - 1);
                            break;
                        }
                    }
                }
            }
        });

        while(!min.isEmpty() && map.getOrDefault(min.peek(), 0) == 0){
            Integer poll = min.poll();
        }
        while(!max.isEmpty() && map.getOrDefault(max.peek(), 0) == 0){
            Integer poll = max.poll();
        }
        if(min.isEmpty() || max.isEmpty()){
            return new int[]{0 ,0};
        }

        int[] answer = {max.peek(), min.peek()};
        return answer;
    }
}
