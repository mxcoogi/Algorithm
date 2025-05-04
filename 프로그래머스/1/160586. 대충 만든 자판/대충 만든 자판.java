import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                String val = String.valueOf(key.charAt(i));
                if(!map.containsKey(val)){
                    map.put(val, i+1);
                }else{
                    if(map.get(val) > i+1){
                        map.put(val, i+1);
                    }
                }
            }
        }

        for(int i = 0; i < targets.length; i++){
            int cnt = 0;
            String target = targets[i];
            for(String val : target.split("")){
                if(!map.containsKey(val)){
                    cnt = -1;
                    break;
                }
                cnt+= map.get(val);
            }
            answer[i] = cnt;
        }

        return answer;
    }
}