class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        int floor = 1;
        double aa = a; double bb = b;
        while(true){
            System.out.println(aa + " " + bb);
            aa = Math.round(aa / 2);
            bb = Math.round(bb / 2);
            if(aa == bb){
                break;
            }
            floor++;
        }
        System.out.println(floor);
        return floor;
    }
}