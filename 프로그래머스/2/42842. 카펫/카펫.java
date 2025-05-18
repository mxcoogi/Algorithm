import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0 , 0};
        int z = (brown - 4) / 2;
        int a = 1; int b = -1 * z; int c = yellow;
        int x1 = (-b +(int) Math.sqrt(b*b - 4*a*c)) / 2*a;
        int x2 = (-b -(int) Math.sqrt(b*b - 4*a*c)) / 2*a;
        if(x1 >= x2){
            answer[0] = x1 + 2;
            answer[1] = x2 + 2;
        }else{
            answer[0] = x2 + 2;
            answer[1] = x1 + 2;
        }
        return answer;
    }
}