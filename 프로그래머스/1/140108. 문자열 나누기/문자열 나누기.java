
class Solution {
    public int solution(String s) {
        char first = s.charAt(0);
        int fCnt = 0;
        int oCnt = 0;
        int idx= 0;
        int answer = 0;
        while(idx < s.length()){
            if(fCnt == 0 && oCnt == 0){
                first = s.charAt(idx);
            }
            if(first == s.charAt(idx)){
                fCnt++;
            }else{
                oCnt++;
            }
            if(fCnt==oCnt){
                answer++;
                fCnt = 0;
                oCnt = 0;
            }
            if(idx == s.length()-1 && oCnt!=fCnt){
                answer++;
            }
            idx++;
        }
        return answer;
    }
}