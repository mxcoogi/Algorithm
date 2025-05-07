import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int idx = 0;
        int[] arr = {1, 2, 3, 1};
        ArrayList<Integer> temp = new ArrayList<>();
        while (idx < ingredient.length) {
            temp.add(ingredient[idx++]);
            if (temp.size() > 3) {
                boolean flag = true;
                for (int i = 0; i < 4; i++) {
                    if (temp.get(temp.size() - 1-i) != arr[3 - i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (int i = 0; i < 4; i++) {
                        temp.remove(temp.size() - 1);
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}