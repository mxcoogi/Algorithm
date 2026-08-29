
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Node> queue = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < priorities.length; i++) {
            Node node = new Node();
            node.idx = i;
            node.priority = priorities[i];
            queue.add(node);
            map.put(node.priority, map.getOrDefault(node.priority, 0) + 1);
        }
        while (!queue.isEmpty()) {
            Node last = queue.removeFirst();
            if(hasUp(map, last)){
                map.put(last.priority, map.get(last.priority) - 1);
                if(map.get(last.priority) == 0){
                    map.remove(last.priority);
                }
                answer++;
                if(last.idx == location){
                    break;
                }
            }else{
                queue.add(last);
            }
        }
        return answer;
    }
    boolean hasUp(Map<Integer, Integer> map, Node node) {
        for(int key : map.keySet()){
            if(node.priority < key){
                return false;
            }
        }
        return true;
    }
    static class Node{
        int idx;
        int priority;
    }
}