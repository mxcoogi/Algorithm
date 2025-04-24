import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] array = Arrays.stream(score).boxed().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).toArray(Integer[]::new);
        
        int boxcnt = score.length / m;
        int idx = 0;
        int answer = 0;
        for(int i = 0; i < boxcnt; i++){
            int min = 10;
            int maxIdx = idx + m;
            while(idx < maxIdx){
                if(array[idx] < min){
                    min = array[idx];
                }
                idx++;
            }
            answer += min * m;
        }
        return answer;
    }
}