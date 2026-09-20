import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int water = 0;
        for (int i = 0; i < height.length; i++){

            while (!stack.isEmpty() && height[stack.peek()] < height[i]){
                Integer top = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                var length = i - stack.peek() - 1;
                int hei = Math.min(height[stack.peek()], height[i]) - height[top];
                water += length * hei;
            }

            stack.push(i);
        }
        return water;
    }
}