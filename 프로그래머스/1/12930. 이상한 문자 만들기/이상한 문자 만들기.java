

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] temp = s.split("");
        int idx = 0;
        for(String val: temp){
            if(val.equals(" ")){
                idx = 0;
                answer.append(val);
                continue;
            }
            if(idx % 2 == 0){
                answer.append(val.toUpperCase());
                idx++;
            }else{
                answer.append(val.toLowerCase());
                idx++;
            }
        }
        return answer.toString();
    }
}