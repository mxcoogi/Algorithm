import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i = 0; i <score.length; i++){
            arr.add(score[i]);
            Collections.sort(arr);
            if(arr.size() > k){
                arr.remove(0);
            }
            answer[i] = arr.get(0);
        }
        return answer;
    }
}