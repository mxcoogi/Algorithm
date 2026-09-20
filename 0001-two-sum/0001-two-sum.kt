class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>();
        nums.forEachIndexed { index, i -> map[i] = index }
        for ((index, value) in nums.withIndex()) {
            val need = target - value
            if(map.containsKey(need) && map[need] != index){
                return intArrayOf(map[need]!!, index)
            }
        }
        return intArrayOf()
    }
}