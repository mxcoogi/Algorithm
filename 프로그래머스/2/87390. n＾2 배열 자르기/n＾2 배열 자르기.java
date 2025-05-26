class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            long col = left % n;
            long row = left / n;
            long val;
            if(row > col){
                val = row+1;
            }else{
                val = col+1;
            }
            answer[i] = (int)val;
            left++;
        }

        return answer;
    }
}
