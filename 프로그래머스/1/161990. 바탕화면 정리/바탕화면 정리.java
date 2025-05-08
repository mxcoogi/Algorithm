
class Solution {
    public int[] solution(String[] wallpaper) {

        int len = wallpaper.length;
        int sx = wallpaper[0].length(); int sy = len;
        int ex = 0; int ey = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(sx > j){
                        sx = j;
                    }
                    if(sy > i){
                        sy = i;
                    }

                    if(ex < j){
                        ex = j;
                    }
                    if(ey < i){
                        ey = i;
                    }
                }
            }
        }

        return new int[]{sy, sx, ey+1,ex+1};
    }
}