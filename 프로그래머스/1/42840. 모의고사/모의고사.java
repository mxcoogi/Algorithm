import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) {
                cnt[0]++;
            }
            if (answers[i] == p2[i % p2.length]) {
                cnt[1]++;
            }
            if (answers[i] == p3[i % p3.length]) {
                cnt[2]++;
            }
        }
        int max = Arrays.stream(cnt).max().getAsInt();
        for(int i = 0; i < 3; i++){
            if(cnt[i] == max){
                temp.add(i+1);
            }
        }
        return temp.stream().mapToInt(i -> i).toArray();

    }
}