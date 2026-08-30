import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            int val = prices[i];
            while (!stack.isEmpty() && val < prices[stack.peek()]) {
                Integer pop = stack.pop();
                answer[pop] = i - pop;
            }
            stack.push(i);
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                Integer pop = stack.pop();
                answer[pop] = answer.length - pop -1;
            }
        }
        return answer;
    }
}