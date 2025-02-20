class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;
        for(char val : s.toCharArray()){
            if(val == '('){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt < 0){
                break;
            }
        }
        answer = cnt == 0 ? true : false;
        

        return answer;
    }
}