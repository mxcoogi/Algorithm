class Solution
{
    public int solution(String s)
    {
        int len = s.length();
        int oop = oddP(s);
        int evenp = evenP(s);
        return Math.max(oop, evenp);
    }
    static int oddP(String s){
        int len = s.length();
        int max = 1;
        for(int i = 0; i < len; i++){
            int l = i-1;
            int r = i+1;
            while(l >= 0 && r < len){
                if(s.charAt(l) == s.charAt(r)){
                    if(max < r-l+1){
                        max = r-l+1;
                    }
                    l--;
                    r++;
                    continue;
                }
                break;
            }
        }
        return max;
    }

    static int evenP(String s){
        int len = s.length();
        int max = 0;
        for(int i = 0; i < len; i++){
            int l = i;
            int r = i+1;
            while(l >= 0 && r < len){
                if(s.charAt(l) == s.charAt(r)){
                    if(max < r-l+1){
                        max = r-l+1;
                    }
                    l--;
                    r++;
                    continue;
                }
                break;
            }
        }
        return max;
    }
}