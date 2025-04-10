import java.util.Arrays;
class Solution {
    static int cnt = 0;
    static int[] numbers;
    static int[] res = new int[3];
    public int solution(int[] number) {
        numbers = number;
        recur(0, 0);
        return cnt;
    }
    public void recur(int idx, int depth){
        if(depth == 3){
            if(Arrays.stream(res).sum() == 0){
                cnt++;
            }
            return ;
        }
        for(int i = idx; i < numbers.length; i++){
            res[depth] = numbers[i];
            recur(i+1, depth+1);
        }
    }
}