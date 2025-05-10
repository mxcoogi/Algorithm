import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Set<String>> to = new HashMap<>();
        HashMap<String, Set<String>> from = new HashMap<>();
        HashMap<String, Integer> idx=  new HashMap<>();
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String val = id_list[i];
            to.put(val, new HashSet<>());
            from.put(val, new HashSet<>());
            idx.put(val, i);
        }
        for(String val : report){
            String[] temp = val.split(" ");
            if(!to.get(temp[0]).contains(temp[1])){
                to.get(temp[0]).add(temp[1]);
                from.get(temp[1]).add(temp[0]);
            }
        }
        for(int i = 0; i < id_list.length; i++){
            String val = id_list[i];
            if(from.get(val).size() >= k){
                Iterator<String> it = from.get(val).iterator();
                while(it.hasNext()){
                    int userIdx = idx.get(it.next());
                    answer[userIdx]++;
                }
            }
        }
        return answer;
    }
}