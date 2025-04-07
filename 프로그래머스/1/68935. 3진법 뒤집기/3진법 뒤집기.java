class Solution {
    public int solution(int n) {
        String temp = three(n);
        return ten(temp.split(""));
    }

    public String three(int n){
        StringBuilder st = new StringBuilder();
        do{
            st.append(n % 3);
            n = n / 3;
        }
        while(n != 0);
        return st.toString();
    }

    public int ten(String[] s){
        int res = 0;
        int len = s.length;
        int pow = 1;
        for(int i = 0; i < len; i++){
            res += Integer.parseInt(s[len-1-i]) * pow;
            pow *= 3;
        }
        return res;
    }
}