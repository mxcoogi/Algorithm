import java.util.*;
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double a = Arrays.stream(arr).sum() / (double)arr.length;
        return a;
    }
}