class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0; int idx2 = 0;
        String answer = "Yes";
        for(int i = 0; i < goal.length; i++){
            String val = goal[i];
            if(idx1 < cards1.length && val.equals(cards1[idx1])){
                idx1++;
                continue;
            }
            if(idx2 < cards2.length && val.equals(cards2[idx2])){
                idx2++;
                continue;
            }
            answer = "No";
        }
        return answer;
    }
}