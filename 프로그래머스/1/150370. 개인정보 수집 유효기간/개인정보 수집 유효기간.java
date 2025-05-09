import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] todayTemp = today.split("\\.");
        ArrayList<Integer> arr=  new ArrayList<>();
        for(var val : terms){
            String[] temp = val.split(" ");
            map.put(temp[0], Integer.valueOf(temp[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String args1 = privacies[i].substring(0, 10);
            String args2 = privacies[i].substring(11);
            int year = Integer.parseInt(args1.substring(0, 4)) * 12 * 28;
            int month = Integer.parseInt(args1.substring(5, 7)) * 28;
            int day = Integer.parseInt(args1.substring(8,10));
            
            int date = year + month + day + map.get(args2) * 28;
            int todayYear = Integer.parseInt(todayTemp[0]) * 12 * 28
                    + Integer.parseInt(todayTemp[1])* 28 + Integer.parseInt(todayTemp[2]);
            if(date <= todayYear){
                arr.add(i+1);
            }

        }

        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}