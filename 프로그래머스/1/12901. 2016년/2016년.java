class Solution {
    public String solution(int a, int b) {
        String[] doy = {"THU","FRI","SAT", "SUN","MON","TUE","WED"};
        int day = b + monthToday(a);
        String answer = doy[day % 7];
        return answer;
    }
    int monthToday(int month){
        int day = 0;
        for(int i = 1; i < month; i++){
            if(i % 2 != 0){
                if(8 < i){
                    day += 30;
                }else{
                    day += 31;
                }
            }else{
                if(i == 2){
                    day += 29;
                }
                else if (i == 8) {
                    day += 31;
                }
                else{
                    if(i > 8){
                        day += 31;
                    }else{
                        day += 30;   
                    }
                }
            }
        }
        return day;
    }
}