class Solution {
    public String solution(String s, int n) {
        StringBuilder sb= new StringBuilder();
        for(var val : s.toCharArray()){
            int asc = (int)val;
            if(asc == ' '){
                sb.append(val);
                continue;
            }
            if(asc <= 90){
                asc += n;
                if(asc > 90){
                    asc = asc % 90;
                    asc += 64;
                }
                sb.append((char)asc);
            }else{
                asc += n;
                if(asc > 122){
                    asc = asc % 122;
                    asc += 96;
                }
                sb.append((char)asc);
            }
        }
        return sb.toString();
    }
}

