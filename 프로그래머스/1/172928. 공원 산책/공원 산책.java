class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int w = park[0].length();
        int h = park.length;
        int x = 0; int y = 0;
        for(int i = 0; i < h; i++){
            boolean flag = false;
            for(int j = 0; j < w; j++){
                if(park[i].charAt(j) == 'S'){
                    x = j;
                    y = i;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        for(String val : routes){
            String[] temp = val.split(" ");
            String op = temp[0];
            int n = Integer.parseInt(temp[1]);
            boolean flag = true;
            switch (op){
                case "E":
                    for(int i = 1; i <= n; i++){
                        if(x + i >= w || park[y].charAt(x+i) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        x += n;
                    }
                    break;
                case "S":
                    for(int i = 1; i <= n; i++){
                        if(y + i >= w || park[y+i].charAt(x) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        y += n;
                    }
                    break;
                case "W":
                    for(int i = 1; i <= n; i++){
                        if(x -i < 0 || park[y].charAt(x-i) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        x -= n;
                    }
                    break;
                case "N":
                    for(int i = 1; i <= n; i++){
                        if(y - i < 0 || park[y-i].charAt(x) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        y -= n;
                    }
                    break;
                default:
                    break;
            }

        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}