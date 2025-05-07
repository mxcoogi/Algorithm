import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] arr = {"R", "T", "C", "F", "J", "M","A","N"};
        int[] scoreList = {3,2,1,0,1,2,3};
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        for(String val : arr) {
            map.put(val, 0);
        }
        for(int i = 0; i < survey.length; i++){
            String[] val = survey[i].split("");
            int score = scoreList[choices[i]-1];
            if(choices[i] > 4){
                map.put(val[1],map.get(val[1])+score);
            } else if (choices[i] <4) {
                map.put(val[0],map.get(val[0])+score);
            }
        }
        for(int i = 0; i < arr.length; i+=2){
            String val1 = arr[i];
            String val2 = arr[i+1];
            if(map.get(val1) > map.get(val2)){
                answer.append(val1);
            } else if (map.get(val1) < map.get(val2)) {
                answer.append(val2);
            }else{
                answer.append(val1);
            }
        }
        System.out.println(map);
        return answer.toString();
    }
}