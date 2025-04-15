import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx= 0 ;
        for(int[] command : commands){
            int i = command[0]-1;
            int j = command[1]-1;
            int k = command[2]-1;
            int[] temp = new int[j-i+1];
            int l = 0;
            for(;i < j+1; i++){
                temp[l++] = array[i];
            }
            int i1 = Arrays.stream(temp).sorted().toArray()[k];
            answer[idx++] = i1;
        }
        return answer;

    }
}