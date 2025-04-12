class Solution {
    public int solution(int[][] sizes) {
        int W = 0;
        int H = 0;
        for(int[] size : sizes){
            //가장 긴 부분을 가로로 하겠다
            int width = Math.max(size[0], size[1]);
            //가장 짧은 부분을 세로로 하겠다
            int height = Math.min(size[0], size[1]);
            if(W < width){
                W = width;
            }
            if(H < height){
                H = height;
            }
        }
        return W * H;
    }
}