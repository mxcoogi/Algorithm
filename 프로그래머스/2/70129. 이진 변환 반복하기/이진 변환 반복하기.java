class Solution {
    static int[] answer = {0,0};
    public int[] solution(String s) {

        while(!s.equals("1")){
            s = convert(s);
            answer[0]++;
        }
        return answer;
    }

    static String convert(String x){
        int c = x.length();
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == '0'){
                answer[1]++;
                c--;
            }
        }
        return Integer.toBinaryString(c);
    }

}