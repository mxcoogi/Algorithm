class Solution {
    public int solution(int num) {
        
        long val = (long)num;
        for(int i = 0; i < 500; i++){
            if(val == 1) return i;
            
            if(val % 2 == 0){
                val = val / 2;
            }else{
                val = val * 3 + 1;
            }
            
        }
        return -1;
    }
}
