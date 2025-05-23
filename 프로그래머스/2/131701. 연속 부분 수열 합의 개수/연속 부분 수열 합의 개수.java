import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < elements.length; i++){
            int[] arrSum = new int[elements.length];
            arrSum[0] = elements[0];
            set.add(arrSum[0]);
            for(int j = 1; j < arrSum.length; j++){
                arrSum[j] = arrSum[j-1] + elements[j];
                set.add(arrSum[j]);
            }
            ratate(elements);
        }
        return set.size();
    }

    static int[] ratate(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}