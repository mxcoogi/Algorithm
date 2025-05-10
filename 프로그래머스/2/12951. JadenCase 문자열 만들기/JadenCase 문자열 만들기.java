import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb= new StringBuilder();
        s = s.toLowerCase();
        String[] temp = s.split("");
        int idx = 0;
        boolean flag = false;
        
        while(idx < temp.length){
            if(temp[idx].equals(" ")){
                sb.append(temp[idx]);
                flag = false;
                idx++;
                continue;
            }
            if(!flag){
                temp[idx] = temp[idx].toUpperCase();
                flag = true;
            }
            sb.append(temp[idx++]);
        }
        return sb.toString();
    }
}