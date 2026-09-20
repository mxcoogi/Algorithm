class Solution {
    fun trap(height: IntArray): Int {
        var left : Int = 0
        var right : Int = height.size - 1
        var water: Int = 0
        var leftMax : Int = height[left]
        var rightMax : Int = height[right]
        while(left <= right){
            leftMax = maxOf(leftMax, height[left])
            rightMax = maxOf(rightMax, height[right])
            if(leftMax <= rightMax){
                water += leftMax - height[left]
                left++
            }else{
                water += rightMax - height[right]
                right--
            }
        }
        return water
    }
}