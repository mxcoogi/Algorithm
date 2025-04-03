class Solution {
    public boolean solution(String s) {
        int len = s.length();
        if(len != 4 && len != 6){
            return false;
        }
        try{
            int num = Integer.parseInt(s);
        }catch(RuntimeException e){
            return false;
        }
        boolean answer = true;
        return answer;
    }
}