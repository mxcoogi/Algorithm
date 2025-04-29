import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int winAnswer = 0;
        int zeroNum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 6);
        for (int i = 0; i < lottos.length; i++) {
            map.put(i+1, 6-i);
            int val = lottos[i];
            if (val == 0) {
                zeroNum++;
                continue;
            }
            for (int winNum : win_nums) {
                if (val == winNum) {
                    winAnswer++;
                    break;
                }
            }
        }
        answer[0] = map.get(winAnswer + zeroNum);
        answer[1] = map.get(winAnswer);

        return answer;
    }
}