import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            int a = arr[i];
            int b = arr[i+1];
            int res = lcm(a, b);
            arr[i+1] = res;
        }
        return arr[arr.length-1];
    }

    int gcd(int a, int b){

        int c;
        while(b != 0){
            c = a % b;
            a = b;
            b= c;
        }
        return a;
    }
    int lcm (int a, int b){
        return a * b / gcd(a, b);
    }
}