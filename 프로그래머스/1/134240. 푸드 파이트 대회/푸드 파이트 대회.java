import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i < food.length; i++){
            if(food[i] / 2 > 0){
                for(int j = 0; j < food[i] /2; j ++){
                    answer.append(i);
                    stack.add(i);
                }
            }
        }
        answer.append(0);
        while(!stack.empty()){
            answer.append(stack.pop());
        }

        return answer.toString();
    }
}