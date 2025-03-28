import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        if(arr.length == 1) return new int[] {-1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int val : arr){
            if(val == min) continue;
            temp.add(val);
        }

        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }

        return answer ;
    }
}