import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        answer+=check(sb.toString());
        char endChar = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(endChar);
        while(!sb.toString().equals(s)){
            answer+=check(sb.toString());
            char endChar2 = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(endChar2);
        }
        return answer;
    }

    static int check(String s){
        Deque<String> que = new LinkedList<>();
        for(String val : s.split("")){
            if(que.peekLast() == null){
                que.add(val);
                continue;
            }
            if(val.equals("]")){
                if(que.peekLast().equals("[")){
                    que.pollLast();
                    continue;
                }
            }
            if(val.equals("}")){
                if(que.peekLast().equals("{")){
                    que.pollLast();
                    continue;
                }
            }
            if(val.equals(")")){
                if(que.peekLast().equals("(")){
                    que.pollLast();
                    continue;
                }
            }
            que.add(val);
        }
        if(que.isEmpty()){
            return 1;
        }else {
            return 0;
        }
    }
}