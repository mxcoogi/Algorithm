import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        
        int[] x = new int[10];
        int[] y = new int[10];
        for(int i = 0; i < X.length(); i++){
               int idx = X.charAt(i) - 48;
               x[idx]++;
        }
        for(int i = 0; i < Y.length(); i++){
                int idx = Y.charAt(i) - 48;
                y[idx]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < Math.min(x[i], y[i]); j++){
                sb.append(i);
            }
        }
                if(sb.toString().isEmpty()){
            return "-1";
        } else if (sb.toString().charAt(0) == '0') {
            return "0";
        }else{
            return sb.toString();
        }
    }
}