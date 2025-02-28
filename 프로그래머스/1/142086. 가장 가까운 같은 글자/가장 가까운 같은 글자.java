class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        int[] memo = new int[26]; //자동 0 초기화
        for(int i = 0; i < len; i++){
            int temp = s.charAt(i);
            System.out.println((char)temp);
            if(memo[temp-97] == 0) {
                answer[i] =-1;
                memo[temp-97] = i+1;
            }else{
                answer[i] = i+1 - memo[temp-97];
                memo[temp-97] = i+1;
            }
        }
        return answer;
    }
}