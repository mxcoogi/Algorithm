
class Solution {
    public int solution(int n, int m, int[] section) {
        int[] arr = new int[n];
        int answer = 0;
        int idx = 0;
        for(int i = 0; i < section.length; i++){
            if(idx > section[i]){
                continue;
            }
            idx = section[i] + m;
            answer++;
        }

        return answer;
    }
}